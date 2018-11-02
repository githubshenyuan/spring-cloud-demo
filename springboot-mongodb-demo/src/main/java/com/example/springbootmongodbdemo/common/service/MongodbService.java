package com.example.springbootmongodbdemo.common.service;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.List;

@Component
public class MongodbService {
    @Resource
    private MongoTemplate mongoTemplate;

    /**
     * 不指定集合，保存数据
     * @param objectToSave
     * @return
     */
    public void save(Object objectToSave) {
        mongoTemplate.save(objectToSave);
    }

    /**
     * 指定集合，保存数据
     * @param objectToSave
     * @param collectionName
     */
    public void save(Object objectToSave, String collectionName) {
        mongoTemplate.save(objectToSave,collectionName);
    }

    /**
     * 不指定集合,插入数据()
     * @param objectToSave
     */
    public void insert(Object objectToSave) {
        mongoTemplate.insert(objectToSave);
    }

    /**
     * 指定集合，插入数据
     * @param objectToSave
     * @param collectionName
     */
    public void insert(Object objectToSave, String collectionName) {
        mongoTemplate.insert(objectToSave, collectionName);
    }

    /**
     * 根据字段查询集合
     * @param Field
     * @param value
     * @param entityClass
     * @param <T>
     * @return
     */
    public <T> List<T> findListByField(String Field,String value,Class<T> entityClass) {
        Query query=new Query(Criteria.where("userName").is("username"));
        return mongoTemplate.find(query, entityClass);
    }

    /**
     * 根据字段查询一条记录
     * @param Field
     * @param value
     * @param entityClass
     * @param <T>
     * @return
     */
    public <T> T findOneByField(String Field,String value,Class<T> entityClass) {

        Query query=new Query(Criteria.where(Field).is(value));
        return mongoTemplate.findOne(query, entityClass);
    }
}
