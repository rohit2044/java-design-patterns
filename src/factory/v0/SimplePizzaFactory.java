package factory.v0;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "greek" -> new GreekPizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> null; // we can make Pizza abstract too
        };
    }
}
