package com.recipe.recipe.repositories;

import com.recipe.recipe.model.UniteOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UniteOfMeasureRepository extends CrudRepository<UniteOfMeasure, Long> {

     Optional<UniteOfMeasure> findByDescription(String description) ;
}
