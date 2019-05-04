package cn.itsource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/login")
    @ResponseBody
    public String login(String name){
        return name+"1234";
    }
}
