package com.zs.test11;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.*;
import io.netty.handler.stream.ChunkedWriteHandler;

/**
 *
 * http文件服务器
 *
 * @author : zhousong
 * Create in 2018/7/2
 */
public class HttpFileServer {

    private static final String DEFAUL_URL = "/E:/";

    public void run(final int port, final String url) throws Exception{
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast("http-decoder", new HttpRequestDecoder());
                            ch.pipeline().addLast("http-aggregator", new HttpObjectAggregator(65536));
                            ch.pipeline().addLast("http-encoder", new HttpResponseEncoder());
                            ch.pipeline().addLast("http-chunked", new ChunkedWriteHandler());
                            ch.pipeline().addLast("fileServerHandler", new HttpFileserverHandler(url));
                        }
                    });
            ChannelFuture f = b.bind("127.0.0.1", port).sync();
            System.out.println("Http文件服务器启动，地址是: "  + "http://127.0.0.1:" + port + url);
            f.channel().closeFuture().sync();
        } finally {
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }

    }

    public static void main(String[] args) throws Exception {
        new HttpFileServer().run(8080, DEFAUL_URL);
    }

}
