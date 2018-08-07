package com.lihoo.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lihoo.ssm.model.User;

import com.lihoo.ssm.service.UserService;
import com.lihoo.ssm.util.Page;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
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
    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    UserService userService;

//    kexing
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView findAllUsersList(Page page) throws Exception {
        ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<User> us = userService.findAllUsers();
//        int total_page = userService.total();
        int total_page = (int) new PageInfo<>(us).getTotal();
        page.caculateLast(total_page);
//        放入转发参数
        mav.addObject("us", us);
//        放入jsp路径
        mav.setViewName("listUser");
        return mav;
    }
//    kexing
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public ModelAndView addUser(User user) throws Exception {
        logger.debug("user.getUserName():" + user.getUsername());
        userService.addUser(user);
        ModelAndView mav = new ModelAndView("redirect:/user");
        return mav;
    }
//    kexing
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ModelAndView deleteUser(User user) throws Exception {
        userService.deleteUser(user);
        ModelAndView mav = new ModelAndView("redirect:/user");
        return mav;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ModelAndView editUser(User user) throws Exception {
        User u = userService.findUserById(user.getId());
        ModelAndView mav = new ModelAndView("editUser");
        mav.addObject("u",u);
        return mav;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.POST)
    public ModelAndView updateUser(User user) throws Exception {
        userService.updateUser(user);
        ModelAndView mav = new ModelAndView("redirect:/user");
        return mav;
    }
















    @RequestMapping("/addUser")
    public ModelAndView addUserInfo(User user) throws Exception {
        ModelAndView mav  = new ModelAndView("showUser");
        return mav;
    }



















    @ResponseBody
    @RequestMapping("/submitUser")
    public String submitUser(@RequestBody User user) {
        logger.debug("SSM接收到浏览器提交的json, 并转换为User对象：" + user);
        JSONObject rs = new JSONObject();
        rs.put("OK", "OK");
        return rs.toJSONString();
//        return "ok";
    }

    @ResponseBody
    @RequestMapping("/getOneUser")
    public String getOneUser() {
        User u = new User();
        u.setId(100);
        u.setUsername("100号大猫");
        u.setQq(7485125);
        u.setJob("屠夫");
        u.setSchool("电锯惊魂学院");
        u.setUrl("www.ojbk.com");
        JSONObject json = new JSONObject();
        json.put("user", JSONObject.toJSON(u));
        return json.toJSONString();
    }

    @ResponseBody
    @RequestMapping("/getManyUser")
    public String getManyUser() {
        List<User> many_us = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User u = new User();
            u.setId(i);
            u.setUsername("用户名称：" + i);
            u.setQq(4835000 + i);
            u.setJob("工人" + i);
            u.setSchool("野鸡大学" + i);
            u.setUrl("www.kill#"+ i +"er.com");
            many_us.add(u);
        }

        return JSONObject.toJSON(many_us).toString();
    }













//    @RequestMapping("/index")
//    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        ModelAndView mav = new ModelAndView("index");
//        mav.addObject("message","Hello Spring MVC");
//        return mav;
//    }
//
//    @RequestMapping("/jump")
//    public ModelAndView jump() throws Exception {
//        ModelAndView mav = new ModelAndView("redirect:/index");
//        return mav;
//    }
//
//    @RequestMapping("/check")
//    public ModelAndView check(HttpSession session) throws Exception {
//        Integer i = (Integer) session.getAttribute("count");
//        if (i == null) {
//            i = 0;
//        }
//        i++;
//        session.setAttribute("count", i);
//        ModelAndView mav = new ModelAndView("check");
//        return mav;
//    }

}
