package com.ly.springbootTest;

import com.ly.springbootTest.service.SumService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author ：LY
 * @date ：2021/4/15 15:34
 * @description ：SumTest
 */

@SpringBootApplication(scanBasePackages = "com.ly.springbootTest.service")
public class SumTest {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SumTest.class).web(WebApplicationType.NONE).profiles("Java8").run(args);

        SumService bean = context.getBean(SumService.class);
        System.out.println(bean.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        context.close();
    }
}
