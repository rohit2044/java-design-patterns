package factory.v0.abstractFactory;


import factory.v0.Pizza;

public class PizzaStore3 {
    AbstractSimplePizzaFactory abstractFactory;

    public PizzaStore3(AbstractSimplePizzaFactory factory) {
        this.abstractFactory = factory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = abstractFactory.createPizza(type); // factory can be NY or Chicago

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public static void main(String[] args) {
        NYPizzaFactory nyFactory = new NYPizzaFactory();
        PizzaStore3 nyStore = new PizzaStore3(nyFactory);
        System.out.println("Ordered pizza: " + nyStore.orderPizza("cheese").toString());
        System.out.println();

        ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
        var chicagoStore = new PizzaStore3(chicagoFactory);
        System.out.println("Ordered pizza: " + chicagoStore.orderPizza("cheese").toString());
    }
}
