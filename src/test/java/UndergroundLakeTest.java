import Places.UndergroundLake;
import characters.adventurers.Burglar;
import characters.enemies.Gollum;
import org.junit.Before;
import org.junit.Test;
import tools.Weapon;
import treasure.Treasure;

import static org.junit.Assert.assertTrue;

public class UndergroundLakeTest {

    UndergroundLake undergroundLake;
    Burglar hobbit;
    Gollum gollum;
    Weapon weapon;
    Treasure treasure;

    @Before
    public void setUp(){
        undergroundLake = new UndergroundLake();
        weapon = new Weapon("Sting", 80, 3);
        treasure = new Treasure("Precious", 100);
        hobbit = new Burglar("Bilbo Baggins", 100, 100, weapon);
        gollum = new Gollum();
    }

    @Test
    public void canAddGollumToEnemies(){
        undergroundLake.addGollum(gollum);
        assertTrue(undergroundLake.getEnemies().contains(gollum));
    }
}
