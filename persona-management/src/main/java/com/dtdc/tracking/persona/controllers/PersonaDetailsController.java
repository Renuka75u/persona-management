package com.dtdc.tracking.persona.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/persona")
public class PersonaDetailsController {

    @GetMapping("/add")
    public String addPersonaPage() {
        return "add-persona";
    }

    @GetMapping("/details")
    public String personaDetailsPage(Model model,
                                     @RequestParam(name = "name", required = false) String name,
                                     @RequestParam(name = "email", required = false) String email,
                                     @RequestParam(name = "phone", required = false) String phone) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("phone", phone);
        return "persona-details";
    }

    @PostMapping("/submit")
    public String submitPersonaDetails(@RequestParam("name") String name,
                                       @RequestParam("email") String email,
                                       @RequestParam("phone") String phone) {
        return "redirect:/persona/details?name=" + name + "&email=" + email + "&phone=" + phone;
    }
}


