package com.ly.springbootTest.config;

import com.ly.springbootTest.helloworld.EnableHelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：LY
 * @date ：2021/4/15 21:38
 * @description ：HelloWorldAutoConfiguration
 */

@Configuration
@EnableHelloWorld
public class HelloWorldAutoConfiguration {

    @Bean
    public String helloauto(){
        return "hello,autoConfig";
    }

}
