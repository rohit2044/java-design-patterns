package composition.practice;

public class King extends Character{
    public King() {
        weaponBehavior = new SwordBehavior();
    }
}
