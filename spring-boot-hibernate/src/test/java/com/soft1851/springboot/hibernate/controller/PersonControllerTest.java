package com.soft1851.springboot.hibernate.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.soft1851.springboot.hibernate.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class PersonControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;
    @Test
    public void savePerson() throws Exception{
        Person person = new Person();
        person.setId("123");
        person.setAge(20);
        person.setPhone("13912345678");
        person.setEmail("1273163614@qq.com");
        person.setSex("Man");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/api/person")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(person));
        mockMvc.perform(requestBuilder)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void getPersonById() throws Exception{
        //路径参数不需要设置内容，类型选text/plain
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/api/person/1123")
                .contentType(MediaType.TEXT_PLAIN);

        mockMvc.perform(requestBuilder)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.content().string("getUserById.id:id不能小于6位"))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }
    @Test
    void getPersonByName() throws Exception{
        //路径参数不需要设置内容，类型选text/plain
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/api/user")
                .contentType(MediaType.TEXT_PLAIN)
                .param("name", "soft1851");

        mockMvc.perform(requestBuilder)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.content().string("getUserByName.name:name长度超出范围"))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }
}