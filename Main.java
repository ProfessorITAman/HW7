package HW7;

public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Warrior("Warrior", 250, 20),
                new Magic("Magic", 240, 15),
                new Medic("Medic", 255 ,0, 50)
        };
        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
            }
        }
    }
}
