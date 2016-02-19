package com.devilmole.web;

import com.devilmole.common.util.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/2/19 0019.
 */
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "hello, world");
        System.out.println("1231231");
        System.out.println(StringUtil.getUpper("qweqwe"));
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