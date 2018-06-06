/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lagranpizza.pizza.order;

import com.lagranpizza.pizza.Pizza;

/**
 *
 * @author Cristian Rodríguez
 */
public class PizzaOrder {

    private final Long folio;
    private final Pizza pizza;

    private PizzaOrder(Long folio, Pizza pizza) {
        this.folio = folio;
        this.pizza = pizza;
    }

    public Long getFolio() {
        return folio;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public static class Builder {

        private Long folio;
        private Pizza pizza;

        public Builder setFolio(Long folio) {
            this.folio = folio;
            return this;
        }

        public Builder setPizza(Pizza pizza) {
            this.pizza = pizza;
            return this;
        }

        public PizzaOrder build() throws PizzaOrderException {
            if (folio == null) {
                throw new PizzaOrderException("El folio de la orden no ha sido especificado.");
            }
            if (pizza == null) {
                throw new PizzaOrderException("La pizza de la orden no ha sido especificada.");
            }
            return new PizzaOrder(folio, pizza);
        }

    }

}
