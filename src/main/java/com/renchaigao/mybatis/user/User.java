package com.renchaigao.mybatis.user;
import lombok.*;

@Setter
@Getter
@ToString
public class User {
    private Integer id;
    private String nickName;
    private String avatarUrl;
    private String gender;
    private String city;
    private String province;
    private String country;
    private String language;
    private String unionID;
    private String address;
    private String vip;
}
