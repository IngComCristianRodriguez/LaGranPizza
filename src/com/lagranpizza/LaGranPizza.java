/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lagranpizza;

import com.lagranpizza.pizza.order.PizzaOrderResult;
import com.lagranpizza.pizza.order.PizzaOrderController;
import com.lagranpizza.pizza.ChicagoPizza;
import com.lagranpizza.pizza.ClassicPizza;
import com.lagranpizza.pizza.HawaiianPizza;
import com.lagranpizza.pizza.MexicanPizza;
import com.lagranpizza.pizza.Pizza;
import com.lagranpizza.pizza.order.PizzaOrder;
import com.lagranpizza.pizza.order.PizzaOrderException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristian Rodríguez
 */
public class LaGranPizza {

    private static final Logger LOG = Logger.getLogger(LaGranPizza.class.getName());

    private Long folio = 1l; //Folio de la orden.
    private boolean order = true;

    public void orderPizza() {
        while (order) {
            showMenu(); // Mostramos el menú en pantalla
            Scanner scanner = new Scanner(System.in);
            Pizza pizza = null;
            try {
                int option = scanner.nextInt(); //Leemos la entrada del usuario.
                switch (option) {
                    case 1:
                        pizza = new ClassicPizza();
                        break;
                    case 2:
                        pizza = new HawaiianPizza();
                        break;
                    case 3:
                        pizza = new MexicanPizza();
                        break;
                    case 4:
                        pizza = new ChicagoPizza();
                        break;
                    case 5:
                        System.out.println("¿Estas seguro de querer salir del men\u00fa?");
                        System.out.println("Presiona 1 para salir o cualquier bot\u00f3n para permanecer en el men\u00fa.");
                        option = scanner.nextInt();
                        if (option == 1) {
                            order = false;
                        }
                        break;
                    default:
                        //Si no se eligió ninguna opición válida se marcará un error.
                        System.out.println("La opci\u00f3n[" + option + "] no est\u00e1 en el men\u00fa.");
                }
            } catch (InputMismatchException ex) {
                System.out.println("La opci\u00f3n elegida debe ser un n\u00famero del men\u00fa.");
            }
            /*Si no se generó ninguna pizza es por que no se eligió una opción válida
             o se eligió la opción salir pero no se confirmo.*/
            if (pizza == null) {
                continue;
            }
            try {
                PizzaOrder pizzaOrder = new PizzaOrder.Builder()
                        .setFolio(folio++) //Al generar una nueva orden el folio aumenta.
                        .setPizza(pizza)
                        .build();
                PizzaOrderResult pizzaOrderResult = new PizzaOrderController().processPizzaOrder(pizzaOrder);
                showOrderResult(pizzaOrderResult);
            } catch (PizzaOrderException ex) {
                LOG.log(Level.SEVERE, "\n\n\nOcurri\u00f3 un problema al procesar la orden con folio[{0}]: {1}\n\n\n", new Object[]{folio, ex.getMessage()});
            }
        }
    }

    private void showMenu() {
        System.out.println("\n\t*** La Gran Pizza ***");
        System.out.println("\t\tMEN\u00da");
        System.out.println("\t1.Pizza Cl\u00e1sica");
        System.out.println("\t2.Pizza Hawaiana");
        System.out.println("\t3.Pizza Mexicana");
        System.out.println("\t4.Pizza Chicago");
        System.out.println("\t5.Salir");
    }

    private void showOrderResult(PizzaOrderResult pizzaOrderResult) throws PizzaOrderException {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new PizzaOrderException("Error al cargar los resultados de la orden de pizza generada.", e);
        }
        System.out.println("\nOrden con folio[" + pizzaOrderResult.getFolio()
                + "][" + pizzaOrderResult.getPizzaOrderStatus() + "]: "
                + pizzaOrderResult.getMessage());
    }

}
