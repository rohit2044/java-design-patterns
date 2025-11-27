package factory.v2;

import java.util.List;

public interface PizzaIngredientFactory {

    Dough dough();

    Cheese cheese();

    Sauce sauce();

    Clams clams();

    List<Veggies> veggies();

    Pepperoni pepperoni();
}
    


