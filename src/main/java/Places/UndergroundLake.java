package Places;

import characters.Character;
import characters.adventurers.Burglar;
import characters.enemies.Gollum;
import treasure.Treasure;

import java.util.ArrayList;

public class UndergroundLake extends Place{



    public UndergroundLake(){
        super();

    }

    public void addGollum(Character gollum) {
        addToEnemies(gollum);

    }

    public void addBurglar(Burglar hobbit) {
        addToAdventurers(hobbit);
    }

    public void addTreasure(Treasure treasure) {
        addToTreasure(treasure);
    }

    public void removeTreasure(Treasure treasure){
        removeFromTreasure(treasure);
    }
}
