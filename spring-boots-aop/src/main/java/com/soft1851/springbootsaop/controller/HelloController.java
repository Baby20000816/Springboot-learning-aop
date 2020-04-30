package com.soft1851.springbootsaop.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/9
 */
@RestController
@RequestMapping(value = "/api/")
@Slf4j
public class HelloController {

    /**
     * 采用自定的WebLog日志注解，记录调用的接口方法名，是否需要持久化
     *
     * @param arg1
     * @param arg2
     * @return
     */
    @RequestMapping(value = "hello")
    public String getHello(String arg1, int arg2) {
        log.info("控制层获得参数：" + arg1);
        log.info("控制层获得参数：" + arg2);
        //休眠，模拟接口耗时
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello spring boot";
    }


}
