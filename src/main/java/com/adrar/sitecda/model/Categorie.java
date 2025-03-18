package com.adrar.sitecda.model;

import jakarta.persistence.*;

@Entity
@Table(name="categorie")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "libele", nullable = false, length = 50)
    private String libele;

    public Categorie(){}
    public Categorie(String libele) {
        this.libele = libele;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibele() {
        return libele;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }
}
