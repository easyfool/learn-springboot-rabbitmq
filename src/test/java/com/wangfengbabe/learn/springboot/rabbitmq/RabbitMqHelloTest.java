package com.wangfengbabe.learn.springboot.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName RabbitMqHelloTest
 * @Description TODO
 * @Author wangfeng04
 * @Date 2018/12/11 16:55
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {

    @Autowired
    private HelloSender helloSender;

    @Autowired
    private HelloReceiver helloReceiver;

    @Test
    public void hello() throws Exception {
        helloSender.send();
    }

    @Test
    public void helloReceive(){
        helloReceiver.process("wangfeng");

    }

}
