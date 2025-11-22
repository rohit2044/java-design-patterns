package factory.v0.abstractFactory;

import factory.v0.Pizza;

public class NYPizzaFactory extends AbstractSimplePizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYCheesePizza();
//            case "greek" -> new NYGreekPizza();
//            case "pepperoni" -> new NYPepperoniPizza();
            default -> null; // we can make Pizza abstract too
        };
    }
}
