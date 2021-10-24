package com.henrimeng.planner.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping(value = "/login")
public class LoginController {

    @GetMapping("")
    public String login() {
        return "login/login";
    }

    @GetMapping("/register")
    public String register() {
        return "login/register";
    }

    @GetMapping("/resetPassword")
    public String resetPassword() {
        return "login/resetPassword";
    }
}
