package com.example.demo.service;

import com.example.demo.pojo.User;
import com.example.demo.pojo.dto.UserDto;


/*
 * 这里也相当于只是一个接口
 * 具体实现是在UserServie里面
 * 
 * 你可以看看interface, implements都是做什么的。
 */



public interface IUserService {

    /**
     * 插入用户
     * @param user 参数
     * @return 
     */
    User add(UserDto user);

    User search(Integer ID);

    Iterable<User> del(Integer ID);

    User revise(Integer ID, UserDto user);
}
