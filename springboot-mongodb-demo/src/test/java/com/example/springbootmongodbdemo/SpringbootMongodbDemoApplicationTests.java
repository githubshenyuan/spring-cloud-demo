package com.example.springbootmongodbdemo;

import com.example.springbootmongodbdemo.common.service.MongodbService;
import com.example.springbootmongodbdemo.entity.DemoEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.swing.text.html.parser.Entity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMongodbDemoApplicationTests {
    @Resource
    private MongodbService mongodbService;
    @Test
    public void contextLoads() {
        DemoEntity demoEntity = new DemoEntity();
        Long l = 123213L;
        demoEntity.setId(l);
        demoEntity.setUserName("username");
        demoEntity.setPassword("abc");
        mongodbService.insert(demoEntity,"channel");

        DemoEntity demoEntity1 = mongodbService.findOneByField("userName", demoEntity.getUserName(),DemoEntity.class);


    }

}
