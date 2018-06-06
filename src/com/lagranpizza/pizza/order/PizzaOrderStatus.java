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
public enum PizzaOrderStatus {
    REQUEST, ARMED, BAKING, PACKED, DELIVERED;

    //Método para obtener siempre un status válido.
    public static PizzaOrderStatus getValidStatus(PizzaOrderStatus status) {
        if (status == null) {
            return geInicialStatus();
        }
        return status;
    }

    public static PizzaOrderStatus geInicialStatus() {
        return REQUEST;
    }

}
