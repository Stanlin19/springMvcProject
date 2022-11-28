package com.springmvc.usuarios.controllers;

import com.springmvc.usuarios.services.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("users/")
public class UsersController {

    @Autowired
    private IUsersService service;

    @GetMapping("viewUsers")
    public String viewUsers(Model model){
        model.addAttribute("ruta1","users/viewUsers");
        model.addAttribute("ruta2","showUser");
        model.addAttribute("title","Usuario");
        return "mainPage";
    }
}
