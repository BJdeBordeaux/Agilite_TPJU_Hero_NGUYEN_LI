package hero;

import interfaces.ArmeSpecial;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pokemon.Attack;
import pokemon.Pokemon;
import strategies.AttaquePistol;
import strategies.AttaquePokemon;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SpecialHeroTest
{
    private SpecialHero unSpecialHero;
    private Pistol unPistol;

    private Pokemon pokemon;

    public SpecialHeroTest()
    {
    }

    @BeforeEach
    public void setUp()
    {
        System.out.println("setUp");
        unSpecialHero = new SpecialHero("Batman", 1);
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
        unSpecialHero.setAttaqueStategie(AttaquePistol.getInstance());
        assertEquals(201, unSpecialHero.attaque());
    }

    @Test
    public void testSetAttaqueStategie()
    {
        unSpecialHero.setAttaqueStategie(AttaquePokemon.getInstance());
        unSpecialHero.ajouterArmes(pokemon);
        assertEquals(1001, unSpecialHero.attaque());
    }

    @Test
    public void testAjouterArmes()
    {
        unSpecialHero.ajouterArmes(pokemon);
        unSpecialHero.setAttaqueStategie(AttaquePokemon.getInstance());
        assertEquals(1001, unSpecialHero.attaque());
    }

}