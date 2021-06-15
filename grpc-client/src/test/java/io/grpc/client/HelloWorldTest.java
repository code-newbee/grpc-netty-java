package io.grpc.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 功能描述：
 *
 * @Author: XKK
 * @Date: 2021/6/15 11:31
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class HelloWorldTest {

    @Autowired
    HelloWorldService helloWorldService;

    @Test
    public void testGrpc() {
        helloWorldService.greet("xkk");
    }
}
