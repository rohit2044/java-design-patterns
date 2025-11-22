package factory.v0;


public class PizzaStore {

    Pizza orderPizza() {
        // we want Pizza to be abstract,
        // but we then we won't be able to instantiate it
        Pizza pizza = new Pizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * To order different types of pizza (subclasses of Pizza) based on type
     * @param type type of pizza
     * @return Pizza
     */

    Pizza orderPizza(String type) {
        Pizza pizza = switch (type) {
            case "cheese" -> new CheesePizza();
            case "greek" -> new GreekPizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> new Pizza(); // we can make Pizza abstract too
        };

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

        // Bad Cases:
        // 1. if to remove one type of Pizza, we need to change this method
        // 2. new type of pizza to be added
        // Method violates design principle: Closed for modification

        // More reasons to modify this method:
        // 1. Moving out (encapsulating object creation)
        // 2. pizza-creating factory can be used to handle multiple clients like:
        //          OnlinePizzaShop, HomeDeliveryPizza, PizzaShopMenu (price based pizza ordering), etc.

        // Solution implemented in PizzaStore2.java (Factory)
    }
}
