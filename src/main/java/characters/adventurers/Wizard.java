package characters.adventurers;

import behaviours.IFight;
import behaviours.ISpell;
import characters.Character;
import tools.Spell;
import tools.Weapon;
import treasure.Treasure;

import java.util.ArrayList;


public class Wizard extends Character implements IFight, ISpell {

        private Weapon weapon;
        private Spell spell;
        private ArrayList<Treasure> bag;

        public Wizard(String name, int health, int energy, Weapon weapon, Spell spell){
            super(name, health, energy);
            this.weapon = weapon;
            this.spell = spell;
            this.bag = new ArrayList<Treasure>();
        }
        public Weapon getWeapon() {
            return this.weapon;
        }

        public Spell getSpell() {
            return this.spell;
        }

        @Override
        public void fight(Weapon weapon, Character opponent) {

            int damage = this.getWeapon().getDamage();
            int effort = this.getWeapon().getEffort();
            opponent.reduceHealth(damage);
            this.reduceEnergy(effort);

        }

        @Override
        public void castSpell(Spell spell) {

        }

    }
