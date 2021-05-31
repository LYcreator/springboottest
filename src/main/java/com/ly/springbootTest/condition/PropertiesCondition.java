package com.ly.springbootTest.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author ：LY
 * @date ：2021/4/15 15:52
 * @description ：PropertiesCondition
 */

public class PropertiesCondition implements Condition {

    //判断Bean是否可以被装配
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Map<String, Object> attributes = annotatedTypeMetadata.getAnnotationAttributes(ConditionalOnProperties.class.getName());
        String name = (String) attributes.get("name");
        String value = (String) attributes.get("value");
        System.out.println(name + ":" + value);
        return name.equals(value);
    }
}
