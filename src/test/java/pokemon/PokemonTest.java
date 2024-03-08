package pokemon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokemonTest {
    private Pokemon pikachu;
    private Attack strongAttack;

    @BeforeEach
    public void setUp() { // throws java.lang.Exception
        pikachu = new Pokemon();
        strongAttack = new Attack();
    }

    @Test
    public void testLevelUp() {
        pikachu.levelUp(2);
        assertEquals(3, pikachu.getLevel());
    }

    @Test
    public void testAddAttack() {
        pikachu.addAttack(strongAttack);
        assertEquals(2, pikachu.getAttacks().size());

    }

    @Test
    public void testGetAttacks() {
        assertEquals(1, pikachu.getAttacks().size());
    }

    @Test
    public void testSetName() {
        pikachu.setName("Pikachu");
        assertEquals("Pikachu", pikachu.getName());
    }

}