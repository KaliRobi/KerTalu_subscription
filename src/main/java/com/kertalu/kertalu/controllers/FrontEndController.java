package com.kertalu.kertalu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontEndController {

    @GetMapping("/")
    public String home() {
        return "redirect:/index.html";
    }

}

