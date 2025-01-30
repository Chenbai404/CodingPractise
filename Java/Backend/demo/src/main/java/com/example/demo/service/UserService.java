package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.User;
import com.example.demo.pojo.dto.UserDto;
import com.example.demo.repository.UserRepository;

@Service // spring 的 bean
public class UserService implements IUserService{

    @Autowired
    UserRepository userRepository;
        

    @Override
    public User add(UserDto user) {
        
        User userPojo = new User();

        BeanUtils.copyProperties(user, userPojo); // 这个函数可以将 对象user 拷贝到userPojo里面

        return userRepository.save(userPojo);     // .save 增加和修改 可以调取。返回user对象类型 
    }

    @Override
    public User search(Integer ID) {
        
        Optional<User> userOptional = userRepository.findById(ID);  // 根据 ID 查找

        if (userOptional.isPresent()) {
            return userOptional.get();  // 如果找到了，返回用户
        } else {
            System.out.println("User with ID " + ID + " not found");
            return null;
        }
    
    }

    @Override
    public Iterable<User> del(Integer ID) {
        
        Optional<User> userOptional = userRepository.findById(ID);  // 查找现有用户

        if (userOptional.isPresent()) {
            userRepository.deleteById(ID);
            
            return userRepository.findAll();
        } else {
            System.out.println("User with ID " + ID + " not found");
            return null;
        }
    
    }


    @Override
    public User revise(Integer ID, UserDto user) {
        
        Optional<User> userOptional = userRepository.findById(ID);  // 查找现有用户
        
        if (userOptional.isPresent()) {
            User userPojo = userOptional.get();  // 获取现有的 User 对象
            
            // 复制 userDto 中的字段到现有用户对象
            userPojo.setUserName(user.getUserName());
            userPojo.setEmail(user.getEmail());
            userPojo.setPassword(user.getPassword());
    
            // 使用 save() 方法更新用户数据
            return userRepository.save(userPojo);  // 返回更新后的用户
        } else {
            System.out.println("User with ID " + ID + " not found");
            return null;
        }    
    }
}
