package com.whileapp.springmvcrestangular.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @RequestMapping(value="/")
    public String index(Model model){
        model.addAttribute("name", "Prueba spring");
        return "index";
    }
}
