package com.devilmole.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.devilmole.common.util.StringUtil;
import com.devilmole.model.User;
import com.devilmole.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Properties;

/**
 * Created by Administrator on 2016/2/19 0019.
 */
@Controller
public class HomeController {

    @Autowired
    private DemoService demoService;

    @ModelAttribute("user")
    public User getUser(@RequestBody String temp){
        System.out.println("in getUser---->"+temp);
        JSONObject a=JSON.parseObject(temp);
        User user=(User) JSON.toJavaObject(a,User.class);
//        user.setName("name in getuser");
        return user;
    }

    @RequestMapping("/home")
    @ResponseBody
    public String home(Model model,User user) {
        System.out.println("in home---->"+user.getColumns().size());
        model.addAttribute("message", "hello, world");
        System.out.println("1231231");
//        System.out.println(StringUtil.getUpper("qweqwe"));
//        System.out.println("--------->"+demoService.getNumTest());
        //return "WEB-INF/views/home.jsp";
        return "home";
    }

    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("message", "hello, world");
        System.out.println("1241afdafasfd");
        System.out.println(StringUtil.getUpper("1231afaazxc"));
        //return "WEB-INF/views/home.jsp";
        return "test";
    }
}
