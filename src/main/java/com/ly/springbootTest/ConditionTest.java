package com.ly.springbootTest;

import com.ly.springbootTest.condition.ConditionalOnProperties;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author ：LY
 * @date ：2021/4/15 17:23
 * @description ：ConditionTest
 */

//@ConditionalOnProperties(name = "hjy",value = "hello")
public class ConditionTest {

    @Bean
    @ConditionalOnProperties(name = "hjy",value = "hjy")
    public String helloworld(){
        return "hello,hjy";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionTest.class).web(WebApplicationType.NONE).run(args);

        String helloworld = context.getBean("helloworld", String.class);
        System.out.println(helloworld);

        context.close();
    }
}
