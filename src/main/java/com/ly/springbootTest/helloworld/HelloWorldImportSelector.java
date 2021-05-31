package com.ly.springbootTest.helloworld;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ：LY
 * @date ：2021/4/15 14:49
 * @description ：HelloWorldImportSelector
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println(annotationMetadata.getClassName());
        if (annotationMetadata.getClassName().contains("Hjy")){
            return new String[]{HjyConfiguration.class.getName()};
        }
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
