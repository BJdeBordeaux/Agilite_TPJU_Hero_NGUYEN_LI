import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test class HeroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HeroTest
{
    private Hero unHero;
    private Pistol unPistol;

    /**
     * Default constructor for test class HeroTest
     */
    public HeroTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        unHero = new Hero();
        unPistol = new Pistol();
        unPistol.setPuissance(100);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testSetNom(){
        Hero unHero = new Hero();
        unHero.setNom("Bat Man");

        assertEquals(unHero.getNom(), "Bat Man");
    }

    @Test
    public void testSetPistol()
    {
    }

    @Test
    public void testAddPistol()
    {
        unHero.ajouterPistol(unPistol);
        ArrayList<Pistol> pistols = unHero.getPistols();
        assertTrue(pistols.contains(unPistol));
    }

    @Test
    public void testRemovePistol()
    {
        unHero.ajouterPistol(unPistol);
        unHero.retirerPistol(unPistol);
        assertFalse(heroAvoirPistol(unHero, unPistol));
    }

    @Test
    public void testVolerPistol()
    {
        Hero unAutreHero = new Hero();
        unAutreHero.ajouterPistol(unPistol);
        unHero.ajouterPistol(unPistol);
        assertTrue(heroAvoirPistol(unHero, unPistol));
        assertFalse(heroAvoirPistol(unAutreHero, unPistol));
    }

    private Boolean heroAvoirPistol(Hero hero, Pistol pistol) {
        ArrayList<Pistol> pistols = hero.getPistols();
        return pistols.contains(pistol);
    }

    @Test
    public void testPuissanceTotal(){
        // puissance personnelle
        unHero.setPuissance(1);

        // puissance de pistols
        unHero.ajouterPistol(unPistol); // 100

        Pistol petitPistol = new Pistol(10);
        unHero.ajouterPistol(petitPistol); // 10

        // puissance total
        assertEquals(111, unHero.puissanceTotal());
    }
}


