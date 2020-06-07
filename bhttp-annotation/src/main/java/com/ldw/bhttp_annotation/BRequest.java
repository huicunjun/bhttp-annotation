package com.ldw.bhttp_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface BRequest {
    String name() default "";

    /**
     * 支持的方法类型
     *
     * @return
     */
    String[] methods() default {};
}
