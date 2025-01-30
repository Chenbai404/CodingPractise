package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.ResponseMessage;
import com.example.demo.pojo.User;
import com.example.demo.pojo.dto.UserDto;
import com.example.demo.service.IUserService;

import jakarta.validation.Valid;

@RestController // 接口方法返回对象 且该对象回转换成json文本
@RequestMapping("/user") // localhost:8088/user/** */
public class UserController {
    
    @Autowired
    IUserService userService;
    
    // Rest
    // 增加
    @PostMapping("/add")   // URL: localhost:8088/user/add
    public ResponseMessage<User> add(@Valid @RequestBody UserDto user){

        User userNew = userService.add(user);

        return ResponseMessage.success(userNew);


        // userService.add(user);

        // return "success!";
    }

    // 查询
    @GetMapping("/search")
    public ResponseMessage<User> search(Integer ID){
        User userNew = userService.search(ID);

        return ResponseMessage.success(userNew);
    }

    // 修改
    @PutMapping("/revise")
    public ResponseMessage<User> revise(Integer ID, @RequestBody UserDto user){
        
        User userNew = userService.revise(ID, user);

        return ResponseMessage.success(userNew);
    }

    // 删除用户
    @DeleteMapping("/del")
    public ResponseMessage<Iterable<User>> del(Integer ID){
        Iterable<User> remainingUsers = userService.del(ID);

        return ResponseMessage.success(remainingUsers);
    }


}
