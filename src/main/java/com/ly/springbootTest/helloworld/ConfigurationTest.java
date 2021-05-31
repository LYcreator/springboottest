package com.ly.springbootTest.helloworld;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author ：LY
 * @date ：2021/4/15 14:34
 * @description ：ConfigurationTest
 */

@EnableHelloWorld
public class ConfigurationTest {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConfigurationTest.class).web(WebApplicationType.NONE).run(args);
        String helloworld = context.getBean("helloworld", String.class);
        System.out.println(helloworld);
        context.close();
    }
}
