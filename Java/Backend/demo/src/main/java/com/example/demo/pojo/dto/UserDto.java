package com.example.demo.pojo.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public class UserDto {

    @NotBlank(message = "User name cannt be empty")             //去除空格
    //@NotEmpty
    private String userName;
    @NotBlank(message = "Password annt be empty") 
    @Length(min =6, max =12)
    private String password;
    @Email(message = "email format is not correct")
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDto [userName=" + userName + ", password=" + password + ", email=" + email + "]";
    }
    

    
    
}
