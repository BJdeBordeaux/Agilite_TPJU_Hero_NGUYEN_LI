package hero;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {
    private Hero hero;
    private Pistol pistol;

    @BeforeEach
    public void setUp() {
        hero = new Hero();
        pistol = new Pistol();
        pistol.setPower(100);
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSetName() {
        Hero hero = new Hero();
        hero.setName("Batman");
        assertEquals(hero.getName(), "Batman");
    }

    @Test
    public void testAddPistol() {
        hero.addPistol(pistol);
        ArrayList<Pistol> pistols = hero.getPistols();
        assertTrue(pistols.contains(pistol));
    }

    @Test
    public void testRemovePistol() {
        hero.addPistol(pistol);
        hero.removePistol(pistol);
        assertFalse(heroHavePistol(hero, pistol));
    }

    @Test
    public void testStealPistol() {
        Hero otherHero = new Hero();
        otherHero.addPistol(pistol);
        hero.addPistol(pistol);
        assertTrue(heroHavePistol(hero, pistol));
        assertFalse(heroHavePistol(otherHero, pistol));
    }

    private Boolean heroHavePistol(Hero hero, Pistol pistol) {
        ArrayList<Pistol> pistols = hero.getPistols();
        return pistols.contains(pistol);
    }

    @Test
    public void testTotalStrength() {
        hero.setStrength(1);

        hero.addPistol(pistol); // 100

        Pistol smallPistol = new Pistol(10);
        hero.addPistol(smallPistol); // 10

        assertEquals(111, hero.totalStrength());
    }
}


