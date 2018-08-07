package com.lihoo.ssm.service;

import com.lihoo.ssm.model.User;
import com.lihoo.ssm.util.Page;

import java.util.List;

@SuppressWarnings("unused")
public interface UserService {

    //    增加用户
    void addUser(User user) throws Exception;

//    //    删除用户信息
    void deleteUser(int id) throws Exception;
//
//    //    更改用户信息
    void updateUser(User user) throws Exception;
//
//    //    通过id 查找用户
    User findUserById(int id) throws Exception;
//
//    //    通过username 查找用户
    User findUserByName(String username) throws Exception;
//
//    //    查找用户列表
    List<User> findAllUsers() throws Exception;

    List<User> findAllUsers(Page page) throws Exception;

//    //    查询用户总人数
    int total() throws Exception;

}
