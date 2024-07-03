package com.dtdc.tracking.persona.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dtdc.tracking.persona.responsedto.PersonaView;

@Controller
@RequestMapping("/persona")
public class PersonaListController {

    @GetMapping("/list")
    public String addPersonaPage(Model model) {
    	PersonaView field1 = new PersonaView("Radhika", "Customer Information", "referenceNo", "admin", "2024-03-15", "system", "2024-04-20", "/persona/edit/1", "/persona/delete/1");
    	PersonaView field2 = new PersonaView("Siya", "Order Details", "originCity", "system", "2024-05-22", "Windows", "2024-06-15", "/persona/edit/2", "/persona/delete/2");
    	PersonaView field3 = new PersonaView("Geeta", "Shipping Information", "originPincode", "user", "2024-08-10", "admin", "2024-09-30", "/persona/edit/3", "/persona/delete/3");
    	PersonaView field4 = new PersonaView("Ramya", "Billing Information", "destinationCity", "jane_smith", "2024-09-25", "smith_jane", "2024-10-12", "/persona/edit/4", "/persona/delete/4");
    	PersonaView field5 = new PersonaView("Riya", "Tracking Informaion", "destinationPincode", "susan_clark", "2024-11-30", "clark_susan", "2024-12-13", "/persona/edit/5", "/persona/delete/5");
    	List<PersonaView> list = new ArrayList<>();
    	list.add(field1);
    	list.add(field2);
    	list.add(field3);
    	list.add(field4);
    	list.add(field5);
    	model.addAttribute("fieldList", list);
        return "personaList";
    }

}