package com.soft1851.oauth.springbootsoauth.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jh_wu
 * @ClassName TestController
 * @Description TODO
 * @Date 2020/4/29:11:06
 * @Version 1.0
 **/
@RestController
public class TestController {
    @RequestMapping(value = "/index")
    public String simpleIndex(ModelMap map){
        return "index";
    }
}
