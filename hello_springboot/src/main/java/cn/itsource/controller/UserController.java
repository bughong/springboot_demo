package cn.itsource.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class UserController {
    @RequestMapping(value = "/login")
    public String login(String name){
        return "index";
    }
}
