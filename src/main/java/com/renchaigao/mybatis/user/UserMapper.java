package com.renchaigao.mybatis.user;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


public interface UserMapper {
    public Integer addUserinfo(User user);
    public Integer updateUser(User user);
    public Integer updateUserAddressByID(@Param("id") Integer id, @Param("address") String address);

    public User findUserByID(Integer id);
    public User findUserByNikename(String nikename);

    public Integer addUserLogin(UserLogin userlogin);

}
