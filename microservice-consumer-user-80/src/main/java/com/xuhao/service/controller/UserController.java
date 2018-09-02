package com.xuhao.service.controller;

import com.netflix.discovery.converters.Auto;
import com.xuhao.service.mapper.UserClient;
import com.xuhao.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer/user")
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("{id}")
    public User queryUserById(@PathVariable("id")Long id){
       return userClient.queryUserById(id);
    }

}
