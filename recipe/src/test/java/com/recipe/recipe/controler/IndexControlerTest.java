package com.recipe.recipe.controler;

import com.recipe.recipe.model.Recipe;
import com.recipe.recipe.repositories.RecipeRepository;
import com.recipe.recipe.services.RecipeService;
import com.recipe.recipe.services.RecipeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

class IndexControlerTest {

    RecipeService service ;

    IndexControler indexControler;
    @Mock
    RecipeRepository recipeRepository ;
    @Mock
    Model model ;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        service = new RecipeServiceImpl(recipeRepository) ;
        indexControler=new IndexControler(service) ;

        HashSet<Recipe> data= new HashSet<>();
        data.add(new Recipe());
        when(recipeRepository.findAll()  ).thenReturn(data);
    }

    @Test
    public void mockMvcTest() throws Exception {

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(indexControler).build();
        mockMvc.perform(get("/")).andExpect( status().isOk()).andExpect(view().name("index"));
    }

    @Test
    void getIndex() {
       String result = indexControler.getIndex(model) ;

assertEquals (result , "index");

    }
}