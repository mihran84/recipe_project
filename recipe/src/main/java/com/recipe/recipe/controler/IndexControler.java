package com.recipe.recipe.controler;

import com.recipe.recipe.model.Category;
import com.recipe.recipe.repositories.CategoryRepository;
import com.recipe.recipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControler {


   private final RecipeService recipeService ;

    public IndexControler(RecipeService recipeService) {


        this.recipeService = recipeService;
    }

    @RequestMapping("/")
   public String getIndex(Model model) {
       model.addAttribute("recipes", recipeService.getRecipes());
     return   "index" ;
   }
}
