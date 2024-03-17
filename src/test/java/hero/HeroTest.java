package hero;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class HeroTest
{
    private Hero hero;
    private Pistol pistol;

    /**
     * Default constructor for test class hero.HeroTest
     */
    public HeroTest() {

    }

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
        Hero unHero = new Hero();
        unHero.setName("Bat Man");
        assertEquals(unHero.getName(), "Bat Man");
    }

    @Test
    public void testSetPistol() {
    }

    @Test
    public void testAddPistol()
    {
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
    public void testStealPistol()
    {
        Hero unAutreHero = new Hero();
        unAutreHero.addPistol(pistol);
        hero.addPistol(pistol);
        assertTrue(heroHavePistol(hero, pistol));
        assertFalse(heroHavePistol(unAutreHero, pistol));
    }

    private Boolean heroHavePistol(Hero hero, Pistol pistol) {
        ArrayList<Pistol> pistols = hero.getPistols();
        return pistols.contains(pistol);
    }

    @Test
    public void testTotalStrength(){
        // puissance personnelle
        hero.setStrength(1);

        // puissance de pistols
        hero.addPistol(pistol); // 100

        Pistol petitPistol = new Pistol(10);
        hero.addPistol(petitPistol); // 10

        // puissance total
        assertEquals(111, hero.totalStrength());
    }
}


