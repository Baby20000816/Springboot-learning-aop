//package com.soft1851.springbootmybatisplus.mapper;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import javax.annotation.Resource;
//
//import java.util.List;
//
//@SpringBootTest
//class UserMapperTest {
//@Resource
//    private  UserMapper userMapper;
//
//@Test
//    void testSelectAll(){
//    List<User> users = userMapper.selectList(null);
//    users.forEach(System.out::println);
//    System.out.println(users.size());
//}
//    @Test
//    void deleteById(){
//        userMapper.deleteById(40);
//    }
//
//    @Test
//    void insert(){
//    User user = User.builder().mobile("5").address("1").articles("1").avatar("1.JPG").banner("1.jpg").birthday("2010-10-10").nickname("1").build();
//        userMapper.insert(user);
//    }
//
//    @Test
//    void updateById(){
//    User user = User.builder().mobile("4").password("1").id((long) 40).build();
//        userMapper.updateById(user);
//    }
//
//    @Test
//    void selectById(){
//
//        userMapper.selectById(40);
//    }
//}