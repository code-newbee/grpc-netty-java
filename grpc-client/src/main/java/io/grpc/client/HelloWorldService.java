package io.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.generate.helloworld.GreekerGrpc;
import io.grpc.generate.helloworld.HelloReply;
import io.grpc.generate.helloworld.HelloRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.logging.Level;

/**
 * 功能描述：
 *
 * @Author: XKK
 * @Date: 2021/6/15 10:33
 */
@Component
public class HelloWorldService {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldService.class);

    private GreekerGrpc.GreekerBlockingStub greekerBlockingStub;

    @PostConstruct
    private void init() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1",6565)
                .usePlaintext()
                .build();
        greekerBlockingStub = GreekerGrpc.newBlockingStub(channel);
    }

    public void greet(String name) {
        logger.info("Will try to greet " + name + " ...");
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        HelloReply response;
        try {
            response = greekerBlockingStub.sayHello(request);
        } catch (StatusRuntimeException e) {
            logger.info("sayHello client error");
            return;
        }
        logger.info("Greeting: " + response.getMessage());
    }



}
