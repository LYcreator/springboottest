package com.ly.springbootTest.condition;


import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author Hjy
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(PropertiesCondition.class)
public @interface ConditionalOnProperties {
    String name();
    String value();
}
