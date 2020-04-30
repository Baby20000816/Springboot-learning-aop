package com.soft1851.springboot.hibernate.service;

import com.soft1851.springboot.hibernate.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @author jh_wu
 * @ClassName PersonService
 * @Description TODO
 * @Date 2020/4/30:18:45
 * @Version 1.0
 **/
@Service
@Validated
@Slf4j
public class PersonService {
    public void validatePerson(@Valid Person person) {
        log.info("service方法验证");
    }
}
