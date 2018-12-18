package com.myCompany.mapper;

import com.myCompany.domain.User;

import java.util.List;

public interface UserMapper {
    //遵循的四个原则：
    //接口方法名==User.xml中的id名
    //返回值类型与mapper.xml文件中返回值类型要一致
    //方法的入参类型要与mapper.xml中的入参一致
    //命名空间绑定次接口
    List<User> findAll();
}
