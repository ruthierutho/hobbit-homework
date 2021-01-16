import org.junit.Before;
import org.junit.Test;
import tools.Weapon;

import static org.junit.Assert.assertEquals;

public class WeaponTest {
    Weapon weapon;

    @Before
    public void setUp(){
        weapon = new Weapon("Broadsword", 30, 5);
    }

    @Test
    public void canGetName(){
        assertEquals("Broadsword", weapon.getName());
    }

    @Test
    public void canGetDamage(){
        assertEquals(30, weapon.getDamage());
    }

    @Test
    public void canGetEffort(){
        assertEquals(5, weapon.getEffort());
    }
}
