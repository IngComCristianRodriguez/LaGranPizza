/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lagranpizza.pizza;

import java.util.Arrays;
import java.util.List;

/**
 * Clase que define a la pizza hawaiana.
 *
 * @author Cristian Rodríguez
 */
public final class HawaiianPizza extends Pizza {

    private static final String HAWAIIAN_PIZZA_NAME = "HAWAIIAN PIZZA";
    private static final List<Ingredient> HAWAIIAN_PIZZA_INGREDIENTS = Arrays.asList(Ingredient.CHEESE,
            Ingredient.HAM, Ingredient.PINEAPPLE);

    public HawaiianPizza() {
        super(HAWAIIAN_PIZZA_NAME, HAWAIIAN_PIZZA_INGREDIENTS);
    }

}
