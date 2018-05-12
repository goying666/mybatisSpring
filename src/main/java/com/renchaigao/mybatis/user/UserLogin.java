package com.renchaigao.mybatis.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class UserLogin  extends User{
    private Date loginDate;
}
