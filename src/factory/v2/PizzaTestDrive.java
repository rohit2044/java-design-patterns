package factory.v2;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
//		PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

    }
}