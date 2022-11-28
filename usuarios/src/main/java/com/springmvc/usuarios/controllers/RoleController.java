package com.springmvc.usuarios.controllers;

import com.springmvc.usuarios.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("roles/")
public class RoleController {

    @Autowired
    private IRoleService service;

    @GetMapping("viewRoles")
    public String viewUsers(Model model){
        model.addAttribute("ruta1","rol/viewRoles");
        model.addAttribute("ruta2","showRoles");
        model.addAttribute("title","Roles");
        return "mainPage";
    }
}
