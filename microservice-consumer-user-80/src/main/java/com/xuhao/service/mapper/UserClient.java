package com.xuhao.service.mapper;

import com.xuhao.service.mapper.fallback.UserClientFallback;
import com.xuhao.service.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value = "user-service-01",fallback = UserClientFallback.class)
public interface UserClient {

    @GetMapping("/user/{id}")
    public User queryUserById(@PathVariable("id")Long id);
}
