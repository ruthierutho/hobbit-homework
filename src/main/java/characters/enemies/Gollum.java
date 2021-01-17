package characters.enemies;

import behaviours.IRiddle;
import characters.Character;
import tools.Riddle;
import tools.Weapon;

public class Gollum extends Character implements IRiddle {

    public Gollum(String name, int health, int energy) {
        super(name, health, energy);

    }

    @Override
    public Riddle setRiddle(String answer, String question){
        Riddle riddle = new Riddle(question, answer);
        return riddle;

    }

    @Override
    public boolean guessRiddle(Riddle riddle, String guess) {
        if (riddle.getAnswer() != guess){
            return false;
        }
        return true;
    }


}
