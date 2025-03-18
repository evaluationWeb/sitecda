package com.adrar.sitecda.controller;

import com.adrar.sitecda.model.Categorie;
import com.adrar.sitecda.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping("/categories")
    public String showAllCategories(Model model) {
        model.addAttribute("categories", categorieService.getAllCategories());
        return "categories";
    }

    @GetMapping("/categorie/add")
    public String addCategorie(Model model){
        Categorie categorie = new Categorie();
        model.addAttribute("categorie", categorie);
        return "categorie_add";
    }

    @PostMapping("/categorie")
    public String saveCategorie(Categorie categorie) {
        categorieService.saveCategorie(categorie);
        return "redirect:/categories";
    }
}
