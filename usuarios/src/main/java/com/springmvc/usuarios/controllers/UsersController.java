package com.springmvc.usuarios.controllers;

import com.springmvc.usuarios.models.Users;
import com.springmvc.usuarios.services.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("users/")
public class UsersController  {

    @Autowired
    private IUsersService service;

    @GetMapping("viewUsers")
    public String viewUsers(Model model){
        model.addAttribute("ruta1","users/viewUsers");
        model.addAttribute("ruta2","showUser");
        model.addAttribute("title","Usuario");
        model.addAttribute("usuarios", service.getUsers());
        return "mainPage";
    }

    @GetMapping("formUser")
    public String createUsers(Model model, Users user){
        model.addAttribute("ruta1","users/formUser");
        model.addAttribute("ruta2","formUser");
        model.addAttribute("title","Usuario");
        model.addAttribute("usuario", new Users());
        if(user.getId() != null){
            model.addAttribute("usuario", service.fingByID(user.getId()));
        }
        return "mainPage";
    }

    @PostMapping("saveUser")
    public String saveUser(Model model, Users user){
        model.addAttribute("ruta1","users/viewUsers");
        model.addAttribute("ruta2","showUser");
        model.addAttribute("title","Usuario");
        service.saveUser(user);
        return "redirect:/users/viewUsers";
    }
}
