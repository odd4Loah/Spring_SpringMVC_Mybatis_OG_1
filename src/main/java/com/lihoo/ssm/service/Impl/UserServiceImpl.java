package com.lihoo.ssm.service.Impl;

import com.lihoo.ssm.dao.UserDao;
import com.lihoo.ssm.model.User;
import com.lihoo.ssm.service.UserService;
import com.lihoo.ssm.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lihoo
 * @Title: UserServiceImpl
 * @ProjectName Spring_SpringMVC_Mybatis_OG_1
 * @Description: TODO
 * @date 2018/8/6-11:06
 */

@SuppressWarnings("unused")
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void addUser(User user) throws Exception {
        userDao.addUser(user);
    }

    @Override
    public void deleteUser(int id) throws Exception {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(User user) throws Exception {
        userDao.updateUser(user);
    }

    @Override
    public User findUserById(int id) throws Exception {
        return userDao.findUserById(id);
    }

    @Override
    public User findUserByName(String username) throws Exception {
        return userDao.findUserByName(username);
    }

    @Override
    public List<User> findAllUsers() throws Exception {
        return userDao.findAllUsers();
    }

    @Override
    public List<User> findAllUsers(Page page) throws Exception {
        return userDao.findAllUsers(page);
    }

    @Override
    public int total() throws Exception {
        return userDao.total();
    }





}
