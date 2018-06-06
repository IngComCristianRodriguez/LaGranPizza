/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lagranpizza.pizza.order;

/**
 *
 * @author Cristian Rodríguez
 */
public class PizzaOrderException extends Exception {

    public PizzaOrderException(String message) {
        super(message);
    }

    public PizzaOrderException(String message, Throwable cause) {
        super(message, cause);
    }

}
