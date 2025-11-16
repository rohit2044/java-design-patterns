package composition.practice;

public class Troll extends Character{
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
