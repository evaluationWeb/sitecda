package com.adrar.sitecda.controller;

import com.adrar.sitecda.model.Produit;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("firstname", "Mathieu");
        return "index";
    }

    @GetMapping("/prod")
    public String produit(Model model) {
        Produit produit = new Produit("Livre", "Livre de 50 pages", 14.99);
        model.addAttribute("produit", produit);
        return "produit";
    }

    @GetMapping("/helloworld/{firstname}")
    public String helloworldFirstname(Model model, @PathVariable String firstname) {
        model.addAttribute("prenom", firstname);
        return "hellofirstname";
    }
}
