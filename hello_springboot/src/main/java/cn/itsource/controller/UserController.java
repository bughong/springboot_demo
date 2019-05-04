package cn.itsource.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value = "/login")
    public String login(String name){
        return name+"1234";
    }
}
