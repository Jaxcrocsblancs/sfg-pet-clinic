package com.example.sfgpetclinic.controllers;

import com.example.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/vets")
@Controller
public class VetController {
    @RequestMapping({"","/","/index","/index.html"})
    public String listsVets(Model model){
        return "vets/index";
    }
}
