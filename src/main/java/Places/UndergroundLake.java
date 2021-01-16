package Places;

import characters.Character;
import characters.enemies.Gollum;

public class UndergroundLake extends Place{



    public UndergroundLake(){
        super();

    }

    public void addGollum(Character gollum) {
        this.getEnemies().add(gollum);
    }
}
