package HW7;

public class Magic extends Hero {
    public Magic(String name, int health, int damage) {
        super(name, health, damage);
        setSuperAbilityType("RAINIGN FIREBALLS!");
    }
    @Override
    public void applySuperAbility() {
        System.out.println(getName() + " применяет суперспособность: " + getSuperAbilityType() + "!");
    }
}
