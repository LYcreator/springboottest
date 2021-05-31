package com.ly.springbootTest.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//用来取代传统spring中的xml文件
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloworld(){
        return "hello,world";
    }
}
