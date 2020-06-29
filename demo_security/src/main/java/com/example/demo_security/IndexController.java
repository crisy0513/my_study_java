package com.example.demo_security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangchenxin
 * @date 2020/6/28  17:30
 * @desc
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String root(){
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/user/user_index")
    public String userindex(){
        return "user/user_index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/login_error")
    public String login_error(){
        return "login_error";
    }


    @RequestMapping("/sorry")
    public String access(){
        return "401";
    }

}
