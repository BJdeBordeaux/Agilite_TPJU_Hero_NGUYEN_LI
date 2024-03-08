package hero;

import interfaces.ArmeSpecial;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pokemon.Attack;
import pokemon.Pokemon;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SpecialHeroTest
{
    private SpecialHero unSpecialHero;
    private Pistol unPistol;

    private Pokemon pokemon;

    /**
     * Default constructor for test class hero.SpecialHeroTest
     */
    public SpecialHeroTest()
    {
    }

    @BeforeEach
    public void setUp()
    {
        System.out.println("setUp");
        unSpecialHero = new SpecialHero("Batman", 100);
        unPistol = new Pistol();
        unPistol.setPuissance(100);
        pokemon = new Pokemon("pikachu", 10);
        Attack attack = new Attack("thunder", 1000);
        pokemon.addAttack(attack);
    }

    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testAttaque()
    {
        unSpecialHero.ajouterPuissance(100);
        unSpecialHero.ajouterPistol(unPistol);
        assertEquals(unSpecialHero.attaque(), 300);
    }

    @Test
    public void testSetAttaqueStategie()
    {
//        unSpecialHero.setAttaqueStategie();
    }

    @Test
    public void testAjouterArmes()
    {
        unSpecialHero.ajouterArmes(pokemon);

        assertEquals(unSpecialHero.attaque(), 100);
    }

}