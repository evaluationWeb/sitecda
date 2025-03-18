package com.adrar.sitecda.controller;

import com.adrar.sitecda.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @GetMapping("/produits")
    public String showAllProduit(Model model) {
        model.addAttribute("produits", produitService.getAllProduits());
        return "produits";
    }

    @GetMapping("/produit/{id}")
    public String showProduitById(@PathVariable Long id, Model model) {
        model.addAttribute("produit", produitService.getProduitById(id));
        return "product";
    }
}
