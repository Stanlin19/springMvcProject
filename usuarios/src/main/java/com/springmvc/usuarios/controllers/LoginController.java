package com.springmvc.usuarios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("ruta1","index");
        model.addAttribute("ruta2","index");
        model.addAttribute("title","index");
        return "mainPage";
    }

    @GetMapping("/index")
    public String home(Model model){
        model.addAttribute("ruta1","index");
        model.addAttribute("ruta2","index");
        model.addAttribute("title","index");
        return "mainPage";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/soloCliente")
    public String soloCliente(Model model){
        model.addAttribute("ruta1","cliente/soloC");
        model.addAttribute("ruta2","showClient");
        model.addAttribute("title","Cliente");
        return "mainPage";
    }
}
