package com.soft1851.oauth.springbootsoauth.controller;

import com.soft1851.oauth.springbootsoauth.entity.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author jh_wu
 * @ClassName PersonController
 * @Description 使用spring框架自带的responseEntity作为返回值
 * @Date 2020/4/30:16:33
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api")
public class PersonController {
    @PostMapping("/person")
    public ResponseEntity<Person> savePerson(@RequestBody @Valid Person person){
        return ResponseEntity.ok().body(person);
    }
}
