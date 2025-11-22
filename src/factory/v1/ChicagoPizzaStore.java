package factory.v1;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
//            case "clam" -> new NYStyleClamPizza();
//            case "pepperoni" -> new NYStylePepperoniPizza();
            default -> null;
        };
    }
}
