package com.soft1851.springbootsaop.annotation;

import java.lang.annotation.*;

/**
 * @author admin
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ControllerWebLog {
    String name();
    boolean isSaved() default false;
}
