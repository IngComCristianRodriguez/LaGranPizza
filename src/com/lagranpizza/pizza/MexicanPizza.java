/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lagranpizza.pizza;

import java.util.Arrays;
import java.util.List;

/**
 * Clase que define la pizza Mexicana.
 * @author Cristian Rodríguez
 */
public final class MexicanPizza extends Pizza {

    private static final String MEXICAN_PIZZA_NAME = "MEXICAN PIZZA";
    private static final List<Ingredient> MEXICAN_PIZZA_INGREDIENTS = Arrays.asList(Ingredient.CHEESE,
            Ingredient.JALAPENO, Ingredient.ONION, Ingredient.SAUSAGE);

    public MexicanPizza() {
        super(MEXICAN_PIZZA_NAME, MEXICAN_PIZZA_INGREDIENTS);
    }
}
