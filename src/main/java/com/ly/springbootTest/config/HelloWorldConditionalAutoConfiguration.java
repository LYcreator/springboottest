package com.ly.springbootTest.config;

import com.ly.springbootTest.condition.ConditionalOnProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：LY
 * @date ：2021/4/16 13:11
 * @description ：HelloWorldConditionalAutoConfiguration
 */

@Configuration
@ConditionalOnProperties(name = "hjy",value = "hjy")
public class HelloWorldConditionalAutoConfiguration {

    @Bean
    public String hellocondition(){
        return "hello,auto-condition";
    }
}
