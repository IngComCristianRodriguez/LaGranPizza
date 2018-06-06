/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lagranpizza.pizza.order;

import com.lagranpizza.pizza.Pizza;
import com.lagranpizza.pizza.order.PizzaOrder;
import com.lagranpizza.pizza.order.PizzaOrderException;
import com.lagranpizza.pizza.order.PizzaOrderStatus;
import java.text.MessageFormat;

/**
 *
 * @author Cristian Rodríguez
 */
public class PizzaOrderController {

    private Long folio;
    private Pizza pizza;
    private PizzaOrderResult pizzaOrderResult;

    public PizzaOrderResult processPizzaOrder(PizzaOrder pizzaOrder) throws PizzaOrderException {
        if (pizzaOrder == null) {
            throw new PizzaOrderException("No se ha especificado la orden de pizza a procesar.");
        }
        try {
            folio = pizzaOrder.getFolio();
            pizza = pizzaOrder.getPizza();
            pizzaOrderResult = new PizzaOrderResult(folio);
            acceptPizzaOrder();
            preparePizza();
            bakePizza();
            packPizza();
            deliverPizza();
        } catch (PizzaOrderException e) {
            pizzaOrderResult.setMessage(e.getMessage());
        }
        return pizzaOrderResult;
    }

    private void acceptPizzaOrder() {
        pizzaOrderResult.setPizzaOrderStatus(PizzaOrderStatus.REQUEST);
        pizzaOrderResult.setMessage("Orden aceptada.");
        String message = MessageFormat.format("\nOrden[{0}]: Orden aceptada[{1}].",
                new Object[]{folio, pizza.getName()});
        System.out.println(message);
    }

    private void preparePizza() throws PizzaOrderException {
        String message = MessageFormat.format("\nOrden[{0}]: Preparando pizza con ingredientes{1}.",
                new Object[]{folio, pizza.getIngredients()});
        System.out.println(message);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new PizzaOrderException("Orden[" + folio + "]: Ha ocurrido un error al preparar la pizza.", e);
        }
        pizzaOrderResult.setPizzaOrderStatus(PizzaOrderStatus.ARMED);
        pizzaOrderResult.setMessage("La pizza ha sido preparada.");
        message = MessageFormat.format("Orden[{0}]: PREPARADA.", new Object[]{folio});
        System.out.println(message);
    }

    private void bakePizza() throws PizzaOrderException {
        String message = MessageFormat.format("\nOrden[{0}]: Horneando...", new Object[]{folio});
        System.out.println(message);
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new PizzaOrderException("Orden[" + folio + "]: Ha ocurrido un error al hornear la pizza.", e);
        }
        pizzaOrderResult.setPizzaOrderStatus(PizzaOrderStatus.BAKING);
        pizzaOrderResult.setMessage("La pizza ha sido horneada.");
        message = MessageFormat.format("Orden[{0}]: HORNEADA.", new Object[]{folio});
        System.out.println(message);
    }

    private void packPizza() throws PizzaOrderException {
        String message = MessageFormat.format("\nOrden[{0}]: Empaquetando...", new Object[]{folio});
        System.out.println(message);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new PizzaOrderException("Orden[" + folio + "]: Ha ocurrido un error al empaquetar la pizza.", e);
        }
        pizzaOrderResult.setPizzaOrderStatus(PizzaOrderStatus.PACKED);
        pizzaOrderResult.setMessage("La pizza ha sido empaquetada.");
        message = MessageFormat.format("Orden[{0}]: EMPAQUETADA.", new Object[]{folio});
        System.out.println(message);;
    }

    private void deliverPizza() throws PizzaOrderException {
        String message = MessageFormat.format("\nOrden[{0}]: Entregando...", new Object[]{folio});
        System.out.println(message);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new PizzaOrderException("Ha ocurrido un error al entregar la pizza.", e);
        }
        pizzaOrderResult.setPizzaOrderStatus(PizzaOrderStatus.DELIVERED);
        pizzaOrderResult.setMessage("La pizza ha sido entregada.");
        message = MessageFormat.format("Orden[{0}]: ENTREGADA.", new Object[]{folio});
        System.out.println(message);
    }
}
