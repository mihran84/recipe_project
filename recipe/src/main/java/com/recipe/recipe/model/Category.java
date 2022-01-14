package com.recipe.recipe.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoryName;
    private String description ;

     @ManyToMany ()
     @JoinTable(name = "category_recipes" ,

     joinColumns = @JoinColumn(name = "category_id") ,
             inverseJoinColumns = @JoinColumn(name = "recipe_id")  )
    private List<Recipe> recipeList;

}
