package com.recipe.recipe.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingrediant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    //private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;

    @OneToOne()
    private UniteOfMeasure uniteOfMeasure ;


}
