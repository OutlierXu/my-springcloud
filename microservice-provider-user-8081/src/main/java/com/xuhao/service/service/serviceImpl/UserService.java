package com.xuhao.service.service.serviceImpl;

import com.xuhao.service.mapper.IUserMapper;
import com.xuhao.service.pojo.User;
import com.xuhao.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    @Override
    public User queryUserById(Long id) {
        return userMapper.queryUserById(id);
    }
}
