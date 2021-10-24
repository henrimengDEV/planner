package com.henrimeng.planner.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/layout")
public class LayoutController {

    @GetMapping("/header")
    public String header() {
        return "layout/header";
    }

    @GetMapping("/footer")
    public String footer() {
        return "layout/footer";
    }
}
