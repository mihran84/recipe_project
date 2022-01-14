package com.recipe.recipe.model;

import javax.persistence.*;

@Entity
public class UniteOfMeasure {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uom ;

    private String description ;



}
