package com.ldw.bhttp_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义返回Response
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface BHttpConfig {
    String name() default "";
}
