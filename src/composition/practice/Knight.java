package composition.practice;

public class Knight extends Character{
    public Knight() {
        weaponBehavior = new BowArrowBehavior();
    }
}
