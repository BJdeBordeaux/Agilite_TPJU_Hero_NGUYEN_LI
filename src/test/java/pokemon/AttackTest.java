package pokemon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AttackTest {
    private Attack quickAttack;

    @BeforeEach
    public void setUp() {
        quickAttack = new Attack();
    }

    @AfterEach
    public void tearDown() {
    }

    // Test-infected part
    @Test
    public void testAttackNameNotEmpty() {
        assertFalse(quickAttack.getName().isEmpty());
    }

    @Test
    public void testAttackDamageNonNegative() {
        assertEquals(10, quickAttack.getDamage());
    }
}
