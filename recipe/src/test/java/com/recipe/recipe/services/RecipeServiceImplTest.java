package com.recipe.recipe.services;

import com.recipe.recipe.model.Recipe;
import com.recipe.recipe.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.Times;
import org.springframework.test.annotation.Repeat;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {

    RecipeService service ;
    @Mock
    RecipeRepository recipeRepository ;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);
        service = new RecipeServiceImpl (recipeRepository);

        HashSet<Recipe> data= new HashSet<>();
        data.add(new Recipe());
        when(recipeRepository.findAll()  ).thenReturn(data);
    }


    @Test
    @Repeat(2)
    void getRecipes() {

      Set<Recipe> recipeSet =  service.getRecipes();
    assertEquals (recipeSet.size() , 1);
        verify(recipeRepository, times(1)).findAll();
    }
}