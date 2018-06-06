/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lagranpizza.pizza;

import java.util.Arrays;
import java.util.List;

/**
 * Calse que define a la pizza clásica.
 * @author Cristian Rodríguez
 */
public final class ClassicPizza extends Pizza {

    private static final String CLASSIC_PIZZA_NAME = "CLASSIC PIZZA";
    private static final List<Ingredient> CLASSIC_PIZZA_INGREDIENTS = Arrays.asList(Ingredient.CHEESE,
            Ingredient.PEPERONNI);

    public ClassicPizza() {
        super(CLASSIC_PIZZA_NAME, CLASSIC_PIZZA_INGREDIENTS);
    }

}
