package HW7;

public class Warrior extends Hero {
    public Warrior(String name, int health, int damage) {
        super(name, health, damage);
        setSuperAbilityType("CRITICAL DAMAGE");
    }
    @Override
    public void applySuperAbility() {
        System.out.println(getName() + " применяет суперспособность: " + getSuperAbilityType() + "!");
    }
}

