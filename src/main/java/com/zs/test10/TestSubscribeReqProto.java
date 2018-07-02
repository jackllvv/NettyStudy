package com.zs.test10;

import com.google.protobuf.InvalidProtocolBufferException;
import com.zs.netty.codec.protobuf.SubscribeReqProto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhousong
 * Create in 2018/7/2
 */
public class TestSubscribeReqProto {

    private static byte[] encode(SubscribeReqProto.SubscribeReq req) {
        return req.toByteArray();
    }

    private static SubscribeReqProto.SubscribeReq decode(byte[] body) throws InvalidProtocolBufferException {
        return SubscribeReqProto.SubscribeReq.parseFrom(body);
    }

    private static SubscribeReqProto.SubscribeReq createSubscribeReq() {
        SubscribeReqProto.SubscribeReq.Builder builder = SubscribeReqProto.SubscribeReq.newBuilder();
        builder.setSubReqID(1);
        builder.setUsername("zhousong");
        builder.setProductName("book");
        List<String> address = new ArrayList<>();
        address.add("AAAA");
        address.add("BBBB");
        address.add("CCCC");
        builder.addAllAddress(address);
        return builder.build();
    }

    public static void main(String[] args) throws InvalidProtocolBufferException {
        SubscribeReqProto.SubscribeReq req = createSubscribeReq();
        System.out.println("Before encode : " + req.toString());
        SubscribeReqProto.SubscribeReq decode = decode(encode(req));
        System.out.println("After decode : " + decode.toString());
        System.out.println("Assert equal : ---> " + decode.equals(req));
    }
}
