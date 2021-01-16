package characters.enemies;

import behaviours.IFight;
import characters.Character;
import tools.Weapon;

public class Goblin extends Character implements IFight {

    private Weapon weapon;
    private int strength;

    public Goblin(String name, int health, int energy, int strength) {
        super(name, health, energy);
        this.strength = strength;
    }

    public void fight(Weapon weapon, Character opponent){

    }
}
