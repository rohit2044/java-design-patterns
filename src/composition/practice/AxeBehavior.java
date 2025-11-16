package composition.practice;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Axing it down ...!");
    }
}
