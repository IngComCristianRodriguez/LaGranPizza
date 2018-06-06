/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lagranpizza.pizza;

import java.util.List;

/**
 *
 * @author Cristian Rodríguez
 */
public class Pizza {

    private final String name;
    /*
    Permitimos que sea una lista por si se pidieran
    dos o mas porciones de un mismo ingrediente.
     */
    private final List<Ingredient> ingredientes;

    protected Pizza(String name, List<Ingredient> ingredientes) {
        this.name = name;
        this.ingredientes = ingredientes;
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredients() {
        return ingredientes;
    }

}
