package composition.practice;

public class BowArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Swoosh goes the arrow ----> ");
    }
}
