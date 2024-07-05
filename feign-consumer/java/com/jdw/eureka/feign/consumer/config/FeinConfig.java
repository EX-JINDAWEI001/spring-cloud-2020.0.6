package com.jdw.eureka.feign.consumer.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeinConfig {
    @Bean
    public Retryer myRetryer() {
        // 初始间隔时间为100ms，最大间隔时间为1s，总共请求3次
        return new Retryer.Default(100, 1, 30);
    }
}
