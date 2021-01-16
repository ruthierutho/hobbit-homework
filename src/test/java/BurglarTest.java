import characters.adventurers.Burglar;
import characters.enemies.Goblin;
import org.junit.Before;
import org.junit.Test;
import tools.Spell;
import tools.Weapon;
import treasure.Treasure;

import static org.junit.Assert.assertEquals;

public class BurglarTest {
    Burglar hobbit;
    Weapon weapon;
    Goblin goblin;
    Treasure treasure;

    @Before
    public void setUp(){
        weapon = new Weapon("Sting", 80, 3);
        treasure = new Treasure("Precious", 100);
        hobbit = new Burglar("Bilbo Baggins", 100, 100, weapon);
        goblin = new Goblin("Grob", 90, 100, 80);
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
    public void canBurgleAPlace(){


    }
}
