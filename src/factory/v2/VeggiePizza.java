package factory.v2;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.dough();
        sauce = ingredientFactory.sauce();
        cheese = ingredientFactory.cheese();
        veggies = ingredientFactory.veggies();
    }
}