package com.soft1851.springbootsaop.annotation;

import java.lang.annotation.*;

/**
 * @author admin
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthToken {
    /**
     * 访问接口所需要的身份，默认为空，即登录即可访问，可以定义多个
     * @return
     */
    String[] role_name() default "";
}