package com.ly.springbootTest.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：LY
 * @date ：2021/4/15 14:53
 * @description ：HjyConfiguration
 */
@Configuration
public class HjyConfiguration {
    @Bean
    public String hellohjy(){
        return "hello,hjy";
    }
}
