package com.xuhao.service.mapper;

import com.xuhao.service.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author XuHao
 */
@Mapper
public interface IUserMapper {
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User queryUserById(@Param("id") Long id);
}
