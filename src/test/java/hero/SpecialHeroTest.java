package hero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pokemon.Attack;
import pokemon.Pokemon;
import strategies.PistolAttack;
import strategies.PokemonAttack;

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
        unSpecialHero = new SpecialHero("Batman", 1);
        unPistol = new Pistol();
        unPistol.setPower(100);
        pokemon = new Pokemon("pikachu", 10);
        Attack attack = new Attack("thunder", 1000);
        pokemon.addAttack(attack);
    }

    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testAttack()
    {
        unSpecialHero.increaseStrength(100);
        unSpecialHero.addPistol(unPistol);
        unSpecialHero.setAttackStrategy(PistolAttack.getInstance());
        assertEquals(201, unSpecialHero.attack());
    }

    @Test
    public void testSetAttackStrategy() {
        unSpecialHero.setAttackStrategy(PokemonAttack.getInstance());
        unSpecialHero.addWeapons(pokemon);
        assertEquals(1001, unSpecialHero.attack());
    }

    @Test
    public void testAddWeapons() {
        unSpecialHero.addWeapons(pokemon);
        unSpecialHero.setAttackStrategy(PokemonAttack.getInstance());
        assertEquals(1001, unSpecialHero.attack());
    }

}