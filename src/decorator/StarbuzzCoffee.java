package decorator;

public class StarbuzzCoffee {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new Whip(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new Whip(new Mocha(new Soy(new HouseBlend())));
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
