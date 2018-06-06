/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lagranpizza.pizza.order;

import com.lagranpizza.pizza.order.PizzaOrderStatus;

/**
 *
 * @author Cristian Rodríguez
 */
public class PizzaOrderResult {

    private Long folio;
    private PizzaOrderStatus pizzaOrderStatus;
    private String message;

    protected PizzaOrderResult(Long folio) {
        this.folio = folio;
    }

    public Long getFolio() {
        return folio;
    }

    public void setFolio(Long folio) {
        this.folio = folio;
    }

    public PizzaOrderStatus getPizzaOrderStatus() {
        return pizzaOrderStatus;
    }

    public void setPizzaOrderStatus(PizzaOrderStatus pizzaOrderStatus) {
        this.pizzaOrderStatus = pizzaOrderStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
