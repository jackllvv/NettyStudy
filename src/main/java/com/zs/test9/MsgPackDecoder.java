package com.zs.test9;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import org.msgpack.MessagePack;

import java.util.List;

/**
 * @author : zhousong
 * Create in 2018/7/2
 */
public class MsgPackDecoder extends MessageToMessageDecoder<ByteBuf>{

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
        final byte[] array;
        int len = msg.readableBytes();
        array = new byte[len];
        msg.getBytes(msg.readerIndex(), array, 0, len);
        MessagePack messagePack = new MessagePack();
        out.add(messagePack.read(array));
    }
}
