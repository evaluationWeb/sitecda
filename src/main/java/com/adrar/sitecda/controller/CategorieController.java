package com.adrar.sitecda.controller;

import com.adrar.sitecda.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping("/categories")
    public String showAllCategories(Model model) {
        model.addAttribute("categories", categorieService.getAllCategories());
        return "categories";
    }
}
