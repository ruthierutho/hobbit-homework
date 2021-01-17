import characters.adventurers.Burglar;
import characters.enemies.Goblin;
import org.junit.Before;
import org.junit.Test;
import tools.Riddle;
import tools.Spell;
import tools.Weapon;
import treasure.Treasure;

import static org.junit.Assert.assertEquals;

public class BurglarTest {
    Burglar hobbit;
    Weapon weapon;
    Goblin goblin;
    Treasure treasure;
    Riddle riddle;

    @Before
    public void setUp(){
        weapon = new Weapon("Sting", 80, 3);
        treasure = new Treasure("Precious", 100);
        hobbit = new Burglar("Bilbo Baggins", 100, 100, weapon);
        goblin = new Goblin("Grob", 90, 100, 80);
        riddle = new Riddle("What has roots as nobody sees, Is taller than trees, Up, up it goes, And yet never grows?", "A mountain");
    }

    @Test
    public void canGetEmptyPocket(){
        assertEquals(0, hobbit.getPocket().size());
    }

    @Test
    public void canAddTreasureToPocket(){
        hobbit.addToPocket(treasure);
        assertEquals(1, hobbit.getPocket().size());
    }

    @Test
    public void canDoAFight(){
        hobbit.fight(weapon, goblin);
        assertEquals(97, hobbit.getEnergy());
        assertEquals(10, goblin.getHealth());
    }

    @Test
    public void canSetARiddle(){
        hobbit.setRiddle(riddle);
        assertEquals("What has roots as nobody sees, Is taller than trees, Up, up it goes, And yet never grows?", riddle.getQuestion());
    }

    @Test
    public void canGuessAnswer__true(){
        assertEquals(true, hobbit.guessRiddle(riddle, "A mountain"));
    }

    @Test
    public void canGuessAnswer__false(){
        assertEquals(false, hobbit.guessRiddle(riddle, "Dark"));
    }
}
