package composition;

import composition.behaviors.FlyNoWay;
import composition.ducks.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        // modify fly behaviour
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }
}