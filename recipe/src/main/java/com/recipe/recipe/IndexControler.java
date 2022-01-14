package com.recipe.recipe;

import com.recipe.recipe.model.Category;
import com.recipe.recipe.repositories.CategoryRepository;
import org.springframework.stereotype.Controller;

@Controller
public class IndexControler {


   private final  CategoryRepository categoryRepository ;

    public IndexControler(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

   public Category findByCategoryName(String categoryName) {
       return categoryRepository.findByCategoryName(categoryName);
   }
}
