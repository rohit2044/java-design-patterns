package composition.practice;

public class Queen extends Character{
    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }
}
