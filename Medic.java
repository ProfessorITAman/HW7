package HW7;

public class Medic extends Hero {
    private int healPoints;

    public Medic(String name, int health, int damage, int healPoints) {
        super(name, health, damage);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperience() {
        healPoints += healPoints * 0.1;
        System.out.println(getName() + " увеличил свои единицы лечения до " + healPoints);
    }

    @Override
    public void applySuperAbility() {
        System.out.println(getName() + " применяет суперспособность: Лечит союзников с силой " + healPoints + " HP!");
    }
}

