package factory.v0.abstractFactory;

import factory.v0.Pizza;

public class NYCheesePizza extends Pizza {
    public void prepare() {
        System.out.println("Adding NY styled cheese");
    }

    public void bake() {
    }

    public void cut() {
    }

    public void box() {
    }
}
