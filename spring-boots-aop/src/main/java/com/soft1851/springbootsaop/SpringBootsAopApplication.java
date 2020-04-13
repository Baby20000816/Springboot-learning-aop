package com.soft1851.springbootsaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author admin
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.soft1851.springbootsaop.controller")
public class SpringBootsAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootsAopApplication.class, args);
    }

}
