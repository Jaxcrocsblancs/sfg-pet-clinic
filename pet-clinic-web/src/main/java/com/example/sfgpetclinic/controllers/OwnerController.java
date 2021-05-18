package com.example.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    @RequestMapping({"","/","/index","/index.html"})
    public String listsOwners(Model model){
        return "owners/index";
    }
}
