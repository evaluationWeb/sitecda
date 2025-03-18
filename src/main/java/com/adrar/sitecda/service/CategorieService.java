package com.adrar.sitecda.service;

import com.adrar.sitecda.model.Categorie;
import com.adrar.sitecda.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    public List<Categorie> getAllCategories() {
        return (List<Categorie>) categorieRepository.findAll();
    }

    public Categorie getCategorieById(Long id) {
        return categorieRepository.findById(id).get();
    }
}
