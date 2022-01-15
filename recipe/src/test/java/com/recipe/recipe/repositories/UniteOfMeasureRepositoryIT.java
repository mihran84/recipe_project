package com.recipe.recipe.repositories;

import com.recipe.recipe.model.UniteOfMeasure;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
class UniteOfMeasureRepositoryIT {

    @Autowired
    UniteOfMeasureRepository uniteOfMeasureRepository ;

    @Test
   public void findByDescription(){

       Optional<UniteOfMeasure> uniteOfMeasure = uniteOfMeasureRepository.findByDescription("Teaspoon");

       assertFalse(uniteOfMeasure.isEmpty());


    }

}