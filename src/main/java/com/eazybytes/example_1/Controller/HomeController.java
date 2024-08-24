package com.eazybytes.example_1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = {"","/","/home"})
    public String displayMessage(Model model){
        model.addAttribute("username","Anu");
        return "home.html";
    }
}
