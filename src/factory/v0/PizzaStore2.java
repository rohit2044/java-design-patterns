package factory.v0;


public class PizzaStore2 {
    SimplePizzaFactory factory;

    public PizzaStore2(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    Pizza orderPizza(String type) {
        // we want Pizza to be abstract,
        // but we then we won't be able to instantiate it
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
