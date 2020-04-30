package com.soft1851.springbootsaop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author admin
 */
@SpringBootApplication
@MapperScan("com.soft1851.springbootsaop.mapper")
@ComponentScan("com.soft1851.springbootsaop.service")
@ComponentScan("com.soft1851.springbootsaop.controller")
public class SpringBootsAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootsAopApplication.class, args);
    }

}
