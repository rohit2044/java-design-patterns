package factory.v0.abstractFactory;

import factory.v0.Pizza;

public class ChicagoPizzaFactory extends AbstractSimplePizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoCheesePizza();
//            case "greek" -> new ChicagoGreekPizza();
//            case "pepperoni" -> new ChicagoPepperoniPizza();
            default -> null; // we can make Pizza abstract too
        };
    }
}
