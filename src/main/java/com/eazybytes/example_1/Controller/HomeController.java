package com.eazybytes.example_1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String displayMessage(){
        return "home.html";
    }
}
