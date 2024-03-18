package stepDefinitions;

import hero.SpecialHero;
import interfaces.AttackStrategy;
import interfaces.SpecialWeapon;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pokemon.Attack;
import pokemon.Pokemon;
import strategies.PistolAttack;
import strategies.PokemonAttack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefsUS004AttackStrategySpecialHero {
    private SpecialHero specialHero;
    private int totalAttackPower;

    @Given("there is a SpecialHero named {string} with a strength of {int}")
    public void thereIsASpecialHeroNamedWithAStrengthOf(String specialHeroName, int initialStrength) {
        specialHero = new SpecialHero(specialHeroName, initialStrength);
        Pokemon pikachu = new Pokemon("Pikachu", 30);
        pikachu.addAttack(new Attack());
        pikachu.addAttack(new Attack());
        specialHero.addWeapons(pikachu);
    }

    @When("the {string} attacks with {string}")
    public void theSpecialHeroAttacksWithAttackStrategy(String specialHeroName, String attackStrategy) {
        AttackStrategy strategy = getAttackStrategy(attackStrategy);
        specialHero.setAttackStrategy(strategy);
        totalAttackPower = specialHero.attack();
    }

    @Then("the total attack power of {string} should be {int}")
    public void theTotalAttackPowerOfShouldBe(String specialHeroName, int expectedAttackPower) {
        assertEquals(expectedAttackPower, totalAttackPower);
    }

    private AttackStrategy getAttackStrategy(String attackStrategy) {
        switch (attackStrategy.toLowerCase()) {
            case "pokemon":
                return new PokemonAttack();
            case "pistol":
                return PistolAttack.getInstance();
            default:
                return null;
        }
    }
}
