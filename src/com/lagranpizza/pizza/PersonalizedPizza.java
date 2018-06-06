/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lagranpizza.pizza;

import java.util.List;

/**
 * Clase que puede ser utilizada para cualquier combinación de ingredientes.
 *
 * @author Cristian Rodríguez
 */
public final class PersonalizedPizza extends Pizza {

    private static final String PERSONALIZED_PIZZA_NAME = "PERSONALIZED PIZZA";

    public PersonalizedPizza(List<Ingredient> ingredientes) {
        super(PERSONALIZED_PIZZA_NAME, ingredientes);
    }

}
