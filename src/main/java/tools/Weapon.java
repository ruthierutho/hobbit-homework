package tools;

public class Weapon {

    private String name;
    private int damage;
    private int effort;

    public Weapon(String name, int damage, int effort){
        this.name = name;
        this.damage = damage;
        this.effort = effort;
    }

    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getEffort() {
        return effort;
    }

}
