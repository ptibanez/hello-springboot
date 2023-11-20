package com.apress.demo.infraestructure.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apress.demo.infraestructure.repository.UserRepository;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("users", 
            this.userRepository.findAll());
        return "index";
    }
    
}
