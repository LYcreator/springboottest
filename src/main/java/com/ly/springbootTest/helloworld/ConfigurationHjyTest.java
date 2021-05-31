package com.ly.springbootTest.helloworld;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author ：LY
 * @date ：2021/4/15 14:34
 * @description ：ConfigurationHjyTest
 */

@EnableHelloWorld
public class ConfigurationHjyTest {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConfigurationHjyTest.class).web(WebApplicationType.NONE).run(args);
        String helloworld = context.getBean("helloworld", String.class);
        System.out.println(helloworld);
        context.close();
    }
}
