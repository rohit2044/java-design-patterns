package factory.v1;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // This is the improved 'factory-method' (factory == object creation method)
    protected abstract Pizza createPizza(String type);
}
