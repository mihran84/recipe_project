package com.recipe.recipe.repositories;

import com.recipe.recipe.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category , Long> {

    Category findByCategoryName(String categoryName) ;
}
