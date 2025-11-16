package composition;

public abstract class Duck {
    // add behaviour objects
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {}

    // implement common methods
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    // set behavior at runtime
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
