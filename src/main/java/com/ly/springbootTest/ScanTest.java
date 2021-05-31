package com.ly.springbootTest;

import com.ly.springbootTest.service.MyTestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ：LY
 * @date ：2021/4/15 13:36
 * @description ：ScanTest
 */

//扫描包下所有类
@ComponentScan(basePackages = {"com.ly.springbootTest.service"})
public class ScanTest {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ScanTest.class).web(WebApplicationType.NONE).run(args);
        MyTestService bean = context.getBean(MyTestService.class);
        bean.test();
        context.close();
    }
}
