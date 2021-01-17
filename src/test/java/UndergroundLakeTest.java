import Places.UndergroundLake;
import characters.adventurers.Burglar;
import characters.enemies.Gollum;
import org.junit.Before;
import org.junit.Test;
import tools.Riddle;
import tools.Weapon;
import treasure.Treasure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UndergroundLakeTest {

    UndergroundLake undergroundLake;
    Burglar hobbit;
    Gollum gollum;
    Weapon weapon;
    Treasure treasure;
    Riddle riddle;

    @Before
    public void setUp(){
        undergroundLake = new UndergroundLake();
        weapon = new Weapon("Sting", 80, 3);
        treasure = new Treasure("Precious", 100);
        hobbit = new Burglar("Bilbo Baggins", 100, 100, weapon);
        gollum = new Gollum("Gollum", 50, 80);
    }

    @Test
    public void canAddGollumToEnemies(){
        undergroundLake.addGollum(gollum);
        assertTrue(undergroundLake.getEnemies().contains(gollum));
    }

    @Test
    public void canAddBurglarToAdventurers(){
        undergroundLake.addBurglar(hobbit);
        assertTrue(undergroundLake.getAdventurers().contains(hobbit));
    }

    @Test
    public void canAddTreasureToTreasure(){
        undergroundLake.addTreasure(treasure);
        assertTrue(undergroundLake.getTreasure().contains(treasure));
    }

    @Test
    public void burglarBurglesTreasure(){
        undergroundLake.addGollum(gollum);
        undergroundLake.addBurglar(hobbit);
        undergroundLake.addTreasure(treasure);
       hobbit.burgle(treasure, undergroundLake);
       assertEquals(0, undergroundLake.getTreasure().size());
       assertTrue(hobbit.getPocket().contains(treasure));
    }

    @Test
    public void gollumSetsRiddleBurglarAnswers__true(){
        riddle = gollum.setRiddle("Wind", "Voiceless it cries, Wingless flutters, Toothless bites, Mouthless mutters");
        boolean guess = hobbit.guessRiddle(riddle, "Wind");
        assertEquals(true, guess);
    }

    @Test
    public void gollumSetsRiddleBurglarAnswers__false(){
        riddle = gollum.setRiddle("Wind", "Voiceless it cries, Wingless flutters, Toothless bites, Mouthless mutters");
        boolean guess = hobbit.guessRiddle(riddle, "Dark");
        assertEquals(false, guess);
    }

    @Test
    public void burglarCanSetRiddleGollumAnswers__true(){
        riddle = hobbit.setRiddle("An egg", "A box without hinges, key, or lid, Yet golden treasure inside is hid");
        boolean guess = gollum.guessRiddle(riddle, "An egg");
        assertEquals(true, guess);
    }

    @Test public void burglarCanSetRiddleGollumAnswers__false(){
        riddle = hobbit.setRiddle("Ring", "What's in my pocket?");
        boolean guess = gollum.guessRiddle(riddle, "Handses");
        assertEquals(false, guess);
    }

    @Test public void canRunUndergroundLake(){
        undergroundLake.addGollum(gollum);
        undergroundLake.addBurglar(hobbit);
        undergroundLake.addTreasure(treasure);
        hobbit.burgle(treasure, undergroundLake);
        riddle = gollum.setRiddle("A mountain", "What has roots as nobody sees, Is taller than trees, Up, up it goes, And yet never grows?");
        boolean guess = hobbit.guessRiddle(riddle, "A mountain");

    }


}
