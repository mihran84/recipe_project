package com.recipe.recipe;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecipeApplication {

    public static void main(String[] args) {
       BeanFactory bean  =  SpringApplication.run(RecipeApplication.class, args);

        IndexControler indexControler = (IndexControler) bean.getBean("indexControler");

        System.out.println(indexControler.findByCategoryName("American"));
    }

}
