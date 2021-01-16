package characters;

import treasure.Treasure;

import java.util.ArrayList;

public abstract class Character {
    private String name;
    private int health;
    private int energy;


    public Character(String name, int health, int energy) {
        this.name = name;
        this.health = health;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int newEnergy) {
        this.energy = newEnergy;
    }

    public void reduceEnergy(int effort) {
        this.energy -= effort;
    }

    public void reduceHealth(int damage) {
        this.health -= damage;
    }
}
