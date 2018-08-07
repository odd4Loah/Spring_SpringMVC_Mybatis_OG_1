package com.lihoo.ssm.controller;

import com.lihoo.ssm.model.User;
import com.lihoo.ssm.service.UserService;
import com.lihoo.ssm.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author lihoo
 * @Title: UserController
 * @ProjectName Spring_SpringMVC_Mybatis_OG_1
 * @Description: TODO
 * @date 2018/8/6-11:11
 */

@Controller
@RequestMapping("")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("listUser")
    public ModelAndView findAllUsersList(Page page) throws Exception {
        ModelAndView mav = new ModelAndView();

        List<User> us = userService.findAllUsers(page);
        int total_page = userService.total();

        page.caculateLast(total_page);
//        放入转发参数
        mav.addObject("us", us);
//        放入jsp路径
        mav.setViewName("listUser");
        return mav;

    }

//    @RequestMapping("userName")
//    public ModelAndView findUserByName() throws Exception {
//        ModelAndView mav  = new ModelAndView();
//
//        User us_name = userService.findUserByName("热狗");
//        mav.addObject("us_name", us_name);
//        mav.setViewName("userName");
//        return mav;
//
//    }
}
