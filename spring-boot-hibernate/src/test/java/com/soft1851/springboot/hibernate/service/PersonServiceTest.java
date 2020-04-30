package com.soft1851.springboot.hibernate.service;

import com.soft1851.springboot.hibernate.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import javax.validation.*;
import java.util.Set;
@SpringBootTest
class PersonServiceTest {
    @Autowired
    private PersonService personService;

    @Test
    @ExceptionHandler(ConstraintViolationException.class)
    void validatePerson() throws Exception {
       Person person = new Person();
        person.setId("123");
        person.setName("wjh");
        person.setAge(20);
        person.setPhone("13912345678");
        person.setEmail("1273163614@qq.com");
        person.setSex("Man");
        personService.validatePerson(person);
    }

    @Test
    void checkManually() {
        //通过 Validator 工厂类获得的 Validator实例， 也可以通过注入的方式
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Person person = new Person();
        person.setId("123");
        person.setEmail("abc");
        person.setSex("Man22");
        // 对参数进行校验，得到一组结果
        Set<ConstraintViolation<Person>> violations = validator.validate(person);
        for (ConstraintViolation<Person> constraintViolation : violations) {
            System.out.println(constraintViolation.getMessage());
        }
    }
}