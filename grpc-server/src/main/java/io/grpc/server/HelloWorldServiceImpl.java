package io.grpc.server;

import io.grpc.generate.helloworld.GreekerGrpc;
import io.grpc.generate.helloworld.HelloReply;
import io.grpc.generate.helloworld.HelloRequest;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 功能描述：
 *
 * @Author: XKK
 * @Date: 2021/6/15 10:26
 */
@GRpcService
public class HelloWorldServiceImpl extends GreekerGrpc.GreekerImplBase {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldServiceImpl.class);


    @Override
    public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
        System.out.println("接收到消息 " + req.getName());
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }


}
