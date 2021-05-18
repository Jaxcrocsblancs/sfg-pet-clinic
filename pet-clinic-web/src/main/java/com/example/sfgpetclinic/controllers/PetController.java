package com.example.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/pets")
@Controller
public class PetController {
    @RequestMapping({"","/","/index","/index.html"})
    public String listsPets(Model model){
        return "pets/index";
    }
}
