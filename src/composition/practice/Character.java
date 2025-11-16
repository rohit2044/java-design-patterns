package composition.practice;

public abstract class Character {
    // behaviour objects
    WeaponBehavior weaponBehavior;

    void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior w) {
        this.weaponBehavior = w;
    }
}
