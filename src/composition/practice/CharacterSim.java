package composition.practice;

public class CharacterSim {
    public static void main(String[] args) {
        King king = new King();
        Queen queen = new Queen();
        Knight knight = new Knight();
        Troll troll = new Troll();

        king.fight();
        queen.fight();
        troll.fight();
        knight.fight();

        knight.setWeaponBehavior(new SwordBehavior());
        knight.fight();
    }
}
