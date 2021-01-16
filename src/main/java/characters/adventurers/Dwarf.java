package characters.adventurers;

import behaviours.IFight;
import characters.Character;
import tools.Weapon;
import treasure.Treasure;

import java.util.ArrayList;

public class Dwarf extends Character implements IFight {

    private Weapon weapon;
    private ArrayList<Treasure> bag;


    public Dwarf(String name, int health, int energy, Weapon weapon) {
        super(name, health, energy);
        this.weapon = weapon;
        this.bag = new ArrayList<Treasure>();
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Treasure> getBag() {
        return bag;
    }

    public String sing(){
        return "Far over the misty mountains cold\n" +
                "To dungeons deep and caverns old\n" +
                "We must away ere break of day\n" +
                "To seek the pale enchanted gold.\n" +
                "\n" +
                "The dwarves of yore made mighty spells,\n" +
                "While hammers fell like ringing bells\n" +
                "In places deep, where dark things sleep,\n" +
                "In hollow halls beneath the fells.\n" +
                "\n" +
                "For ancient king and elvish lord\n" +
                "There many a gleaming golden hoard\n" +
                "They shaped and wrought, and light they caught\n" +
                "To hide in gems on hilt of sword.";
    }

    public void fight(Weapon weapon, Character opponent){

    }
}
