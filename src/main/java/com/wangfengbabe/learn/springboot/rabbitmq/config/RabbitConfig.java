package com.wangfengbabe.learn.springboot.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MQConfig
 * @Description TODO
 * @Author wangfeng04
 * @Date 2018/12/11 16:38
 * @Version 1.0
 **/
@Configuration
public class RabbitConfig {

    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }


}
