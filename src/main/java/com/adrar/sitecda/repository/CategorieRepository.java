package com.adrar.sitecda.repository;

import com.adrar.sitecda.model.Categorie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends CrudRepository<Categorie, Long> {
}
