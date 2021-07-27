package com.sheridan.johnny.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class navigationController {

    @GetMapping("/")
    public String index() {
    return "index";
    }

    @GetMapping("/secure")
    public String secureIndex() {
    return "/secure/index";
    }

    @RequestMapping("/login")
    public String login() {
    return "login";
    }

    @GetMapping("/permission-denied")
    public String permissionDenied() {
    return "/error/permission-denied";
    }
}
