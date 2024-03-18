package hero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pokemon.Attack;
import pokemon.Pokemon;
import strategies.PistolAttack;
import strategies.PokemonAttack;

import static org.junit.jupiter.api.Assertions.*;

public class SpecialHeroTest {
    private SpecialHero specialHero;
    private Pistol pistol;
    private Pokemon pokemon;

    @BeforeEach
    public void setUp() {
        specialHero = new SpecialHero("Batman", 1);
        pistol = new Pistol();
        pistol.setPower(100);
        pokemon = new Pokemon("pikachu", 10);
        Attack attack = new Attack("thunder", 1000);
        pokemon.addAttack(attack);
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAttack() {
        specialHero.increaseStrength(100);
        specialHero.addPistol(pistol);
        specialHero.setAttackStrategy(PistolAttack.getInstance());
        assertEquals(201, specialHero.attack());
    }

    @Test
    public void testSetAttackStrategy() {
        specialHero.setAttackStrategy(PokemonAttack.getInstance());
        specialHero.addWeapons(pokemon);
        assertEquals(1001, specialHero.attack());
    }

    @Test
    public void testAddWeapons() {
        specialHero.addWeapons(pokemon);
        specialHero.setAttackStrategy(PokemonAttack.getInstance());
        assertEquals(1001, specialHero.attack());
    }
}