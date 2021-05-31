package com.ly.springbootTest;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author ：LY
 * @date ：2021/4/15 21:37
 * @description ：AutoConfigurationTest
 */


@EnableAutoConfiguration
public class AutoConfigurationTest {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(AutoConfigurationTest.class).web(WebApplicationType.NONE).run(args);
        String hello = context.getBean("helloauto", String.class);
        System.out.println(hello);
        System.out.println(context.getBean("helloworld", String.class));
        System.out.println((context.getBean("hellocondition", String.class)));
        context.close();
    }
}
