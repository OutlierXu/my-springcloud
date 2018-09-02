package com.xuhao.service.controller;

import com.xuhao.service.pojo.User;
import com.xuhao.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XuHao
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("{id}")
    public User queryUserById(@PathVariable("id")Long id){
        return userService.queryUserById(id);
    }

}
