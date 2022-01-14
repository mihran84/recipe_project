package com.recipe.recipe.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;

    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty ;

    @OneToOne(cascade = CascadeType.ALL)
    private Note note ;

    @Lob
     private Byte[] image ;

     @OneToMany(cascade = CascadeType.ALL , mappedBy = "recipe")
     private Set<Ingrediant> ingrediants ;

     @ManyToMany(mappedBy = "recipeList")
    private List<Category> categoryList ;
}
