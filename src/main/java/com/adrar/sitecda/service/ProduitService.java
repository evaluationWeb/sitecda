package com.adrar.sitecda.service;

import com.adrar.sitecda.model.Produit;
import com.adrar.sitecda.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public Produit getProduitById(Long id) {
        /*if(!produitRepository.findById(id).isPresent()) {
            throw new RuntimeException("Le produit qui à l'id : " + id + " n'existe pas");
        }*/
        return produitRepository.findById(id).get();
    }

    public List<Produit> getAllProduits() {
//        if(produitRepository.count() == 0) {
//            throw new RuntimeException("Aucun produit n'est disponible");
//        }
        return (List<Produit>) produitRepository.findAll();
    }
}
