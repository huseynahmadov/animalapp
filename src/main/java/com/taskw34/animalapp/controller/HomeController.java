package com.taskw34.animalapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pages")
public class HomeController {

    @GetMapping("/home")
    public ModelAndView getHomePage() {
        return new ModelAndView("index");
    }

    @GetMapping("/signup")
    public ModelAndView getSignUpPage() {
        return new ModelAndView("register");
    }
}
