package com.example.demo.repository;

import com.example.demo.pojo.User;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/*
 * 这里使用了CrudRepository,这个接口提供了基本增删改查方法 例如 UserRepository.save(entity):添加一条数据
 *                                                                         save(entities)：添加多条数据entities为集合
 * 使用的时候要注意规定两个类型<你要指定那个类型，你指定类型的Key ID>
 */

@Repository   // spring bean

public interface UserRepository extends CrudRepository<User, Integer> {
}

