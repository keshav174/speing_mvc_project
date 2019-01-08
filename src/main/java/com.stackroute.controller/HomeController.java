package com.stackroute.controller;

import com.stackroute.domain.UserClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    UserClass user = new UserClass();
    @RequestMapping(value ="/")
    public String greeting(){

        return "login";

    }

    @RequestMapping(value="user")
    public String login(@ModelAttribute("userP") UserClass userClass, ModelMap map){


        map.addAttribute("user", userClass.getUserName());

        return "index";
    }
}
