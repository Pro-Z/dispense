package com.example.dispenseprocessingannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface Dispense {

    boolean RELEASE = false;

    boolean DEBUG = true;

    String name() default "Main";

    boolean type() default RELEASE;

    int priority() default 0;

    boolean async() default false;

    long delay() default 0;
}
