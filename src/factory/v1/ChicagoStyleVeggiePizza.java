package factory.v1;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shrooms and Red capsicum");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}