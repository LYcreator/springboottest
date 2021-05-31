package com.ly.springbootTest.myinterface;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 * @author ：LY
 * @date ：2021/4/15 11:14
 * @description ：MyService
 */

//可以标注在什么地方
@Target(ElementType.TYPE)
//保留的时机，也就是通过反射可以加载的时机
@Retention(RetentionPolicy.RUNTIME)
//标注后在生成javadoc的时候就会把注解给显示出来
@Documented
//控制层模式注解
@Service
public @interface MyService {
    @AliasFor(
            annotation = Component.class
    )
    String value() default "";
}
