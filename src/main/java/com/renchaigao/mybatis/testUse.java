package com.renchaigao.mybatis;

import com.renchaigao.mybatis.user.User;
import com.renchaigao.mybatis.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class testUse{

    @Autowired
    private UserMapper userdao;

    @PostMapping(path = "/test" , consumes = "application/json")
    @ResponseBody
    public String test( ){
        User user = new User();
        user.setAddress("789555555");
        user.setNickName("aaa23");
        userdao.addUserinfo(user);
        return userdao.findUserByNikename("aaa23").getAddress();
    }
}
