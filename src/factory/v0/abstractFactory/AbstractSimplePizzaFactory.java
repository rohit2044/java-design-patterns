package factory.v0.abstractFactory;

import factory.v0.Pizza;

public abstract class AbstractSimplePizzaFactory {

    // making factory abstract so that concrete factories can have their own creation implementations
    // only pizza styles are custom, not the pizza creation procedures
    // Hence: Factory, Pizza would be abstract, but not the stores

    public abstract Pizza createPizza(String type);

    /* TODO: For more control over bake(), cut() and other store related methods, we can remove this factory class,
     * and implement abstract PizzaStore.java in v1
     */
}
