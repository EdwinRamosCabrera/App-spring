package com.example.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.spring.model.Contact;
import com.example.spring.repository.ContactoRepository;


import jakarta.validation.Valid;

@Controller
public class ContactoController {
    
    private static final String INDEX = "contact/create";
    private static String MODEL_CONTACT = "contact";
    private final ContactoRepository contactsData;

    public ContactoController(ContactoRepository contactsData){
        this.contactsData = contactsData;
    }

    @GetMapping("/contact/create")
    public String contactForm(Model model){
        model.addAttribute(MODEL_CONTACT, new Contact());
        return INDEX;
    }

    @PostMapping("/contact/create")
    public String createContact(Model model, @Valid Contact contact, BindingResult result){
        if(result.hasFieldErrors()){
            model.addAttribute("message", "No se registro el mensaje");
        }else {
            this.contactsData.save(contact);
            model.addAttribute(MODEL_CONTACT, contact);
            model.addAttribute("message", "Registro de mensaje exitoso");
        }
        return INDEX;
    }
}
