package factory.v2;

import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough dough() {
        return new ThinCrustDough();
    }

    public Sauce sauce() {
        return new MarinaraSauce();
    }

    public Cheese cheese() {
        return new ReggianoCheese();
    }

    public List<Veggies> veggies() {
        return List.of(new Onion(), new Garlic());
    }

    public Pepperoni pepperoni() {
        return new SlicedPepperoni();
    }

    public Clams clams() {
        return new FreshClams();
    }
}
