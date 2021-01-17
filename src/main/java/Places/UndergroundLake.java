package Places;

import characters.Character;
import characters.adventurers.Burglar;
import characters.enemies.Gollum;
import tools.Riddle;
import treasure.Treasure;

import java.util.ArrayList;

public class UndergroundLake extends Place {


    public UndergroundLake() {
        super();

    }

    public void addGollum(Character gollum) {
        addToEnemies(gollum);

    }

    public void addBurglar(Burglar hobbit) {
        addToAdventurers(hobbit);
    }

    public void removeBurglar(Burglar hobbit) {
        removeFromAdventurers(hobbit);
    }

    public void addTreasure(Treasure treasure) {
        addToTreasure(treasure);
    }

    public void removeTreasure(Treasure treasure) {
        removeFromTreasure(treasure);
    }

    public boolean riddleOne(Gollum gollum, Burglar hobbit) {
        Riddle riddle = gollum.setRiddle("A mountain", "What has roots as nobody sees Is taller than trees, Up, up it goes, And yet never grows?");
        boolean guess = hobbit.guessRiddle(riddle, "A mountain");
        if (guess != true) {
            return false;
        }
        return true;
    }

//    public void run(Gollum gollum, Burglar hobbit, Treasure treasure){
//        addGollum(gollum);
//        addBurglar(hobbit);
//        addTreasure(treasure);
//        hobbit.burgle(treasure, this);
//        if (riddleOne(gollum, hobbit) != true){
//               gollum.eatBurglar(hobbit);
//             }
    //          if
//            Riddle riddle2 = hobbit.setRiddle("An egg", "A box without hinges, key, or lid, Yet golden treasure inside is hid");
//            boolean guess2 = gollum.guessRiddle(riddle2, "An egg");
//            if (guess2 = true){
//                Riddle riddle3 = gollum.setRiddle("Wind", "Voiceless it cries, Wingless flutters, Toothless bites, Mouthless mutters");
//                boolean guess3 = hobbit.guessRiddle(riddle3, "Wind");
//                if (guess3 = true){
//                    Riddle riddle4 = hobbit.setRiddle("Ring", "What's in my pocket?");
//                    boolean guess4 = gollum.guessRiddle(riddle4, "hands");
//                    if (guess4 = false){
//                        hobbit.putOnRing(treasure);
//                        this.removeBurglar(hobbit);
//                    }
//                }
//            }
//        }
//
//
//    }
}
