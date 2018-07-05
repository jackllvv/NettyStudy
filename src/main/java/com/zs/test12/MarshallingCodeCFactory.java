/*
 * Copyright 2013-2018 Lilinfeng.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zs.test12;

import com.zs.test13.MarshallingEncoder;
import io.netty.handler.codec.marshalling.*;
import org.jboss.marshalling.MarshallerFactory;
import org.jboss.marshalling.Marshalling;
import org.jboss.marshalling.MarshallingConfiguration;

/**
 * @author Lilinfeng
 * @date 2014年2月25日
 * @version 1.0
 */
public final class MarshallingCodeCFactory {

    /**
     * 创建Jboss Marshalling解码器MarshallingDecoder
     * 
     * @return
     */
    public static com.zs.test13.MarshallingDecoder buildMarshallingDecoder() {
	final MarshallerFactory marshallerFactory = Marshalling
		.getProvidedMarshallerFactory("serial");
	final MarshallingConfiguration configuration = new MarshallingConfiguration();
	configuration.setVersion(5);
	UnmarshallerProvider provider = new DefaultUnmarshallerProvider(
		marshallerFactory, configuration);
	com.zs.test13.MarshallingDecoder decoder = new com.zs.test13.MarshallingDecoder(provider, 1024);
	return decoder;
    }

    /**
     * 创建Jboss Marshalling编码器MarshallingEncoder
     * 
     * @return
     */
    public static com.zs.test13.MarshallingEncoder buildMarshallingEncoder() {
	final MarshallerFactory marshallerFactory = Marshalling
		.getProvidedMarshallerFactory("serial");
	final MarshallingConfiguration configuration = new MarshallingConfiguration();
	configuration.setVersion(5);
	MarshallerProvider provider = new DefaultMarshallerProvider(
		marshallerFactory, configuration);
	com.zs.test13.MarshallingEncoder encoder = new MarshallingEncoder(provider);
	return encoder;
    }
}
