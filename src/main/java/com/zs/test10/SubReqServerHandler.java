package com.zs.test10;

import com.zs.netty.codec.protobuf.SubScribeRespProto;
import com.zs.netty.codec.protobuf.SubscribeReqProto;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * @author : zhousong
 * Create in 2018/7/2
 */
public class SubReqServerHandler extends ChannelHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        SubscribeReqProto.SubscribeReq req = (SubscribeReqProto.SubscribeReq) msg;
        if ("zhousong".equalsIgnoreCase(req.getUsername())) {
            System.out.println("Service accept client subscribe req : [" + req.toString() + "]");
            ctx.writeAndFlush(resp(req.getSubReqID()));
        }
    }

    private SubScribeRespProto.SubscribeResp resp(int subReqID) {
        SubScribeRespProto.SubscribeResp.Builder builder = SubScribeRespProto.SubscribeResp.newBuilder();
        builder.setSubRepID(subReqID);
        builder.setRespCode(0);
        builder.setDesc("Netty book order succeed, 3 days later, sent to address");
        return builder.build();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
