package characters.adventurers;

import Places.Place;
import Places.UndergroundLake;
import behaviours.IFight;
import behaviours.IRiddle;
import characters.Character;
import tools.Riddle;
import tools.Weapon;
import treasure.Treasure;

import java.util.ArrayList;

public class Burglar extends Character implements IFight, IRiddle {

    private Weapon weapon;
    private ArrayList<Treasure> pocket;


    public Burglar(String name, int health, int energy, Weapon weapon) {
        super(name, health, energy);
        this.weapon = weapon;
        this.pocket = new ArrayList<Treasure>();

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Treasure> getPocket() {
        return pocket;
    }

    public void addToPocket(Treasure treasure) {
        this.pocket.add(treasure);
    }

    public void burgle(Treasure treasure, Place place){
       place.removeFromTreasure(treasure);
       addToPocket(treasure);
    }

    @Override
    public void fight(Weapon weapon, Character opponent) {

        int damage = this.getWeapon().getDamage();
        int effort = this.getWeapon().getEffort();
        opponent.reduceHealth(damage);
        this.reduceEnergy(effort);

    }

    @Override
    public String setRiddle(Riddle riddle){
       return riddle.getQuestion();

    }

    @Override
    public boolean guessRiddle(Riddle riddle, String guess) {
        if (riddle.getAnswer() != guess){
            return false;
        }
        return true;
    }


}
