/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lagranpizza.pizza;

import java.util.Arrays;
import java.util.List;

/**
 * Clase que define a la pizza estilo Chicago.
 *
 * @author Cristian Rodríguez
 */
public final class ChicagoPizza extends Pizza {

    private static final String CHICAGO_PIZZA_NAME = "CHICAGO PIZZA";
    private static final List<Ingredient> CHICAGO_PIZZA_INGREDIENTS = Arrays.asList(Ingredient.CHEESE,
            Ingredient.PEPERONNI, Ingredient.SAUSAGE, Ingredient.ONION);

    public ChicagoPizza() {
        super(CHICAGO_PIZZA_NAME, CHICAGO_PIZZA_INGREDIENTS);
    }
}
