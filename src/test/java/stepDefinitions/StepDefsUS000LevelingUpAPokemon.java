package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pokemon.Pokemon;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefsUS000LevelingUpAPokemon {
    private Pokemon pokemon;

    @Given("the Pokemon's level is {int}")
    public void thePokemonSLevelIs(int initialLevel) {
        pokemon = new Pokemon();
        pokemon.setLevel(initialLevel);
    }

    @When("I increase the Pokemon's level by {int}")
    public void iIncreaseThePokemonSLevelBy(int levelIncrease) {
        pokemon.levelUp(levelIncrease);
    }

    @Then("the Pokemon's level should be {int}")
    public void thePokemonSLevelShouldBe(int expectedLevel) {
        assertEquals(expectedLevel, pokemon.getLevel(), "The Pokemon's level does not match the expected level.");
    }

    @Given("a Pokemon named {string} at level {int}")
    public void aPokemonNamedAtLevel(String name, int initialLevel) {
        pokemon = new Pokemon();
        pokemon.setName(name);
        pokemon.setLevel(initialLevel);
    }

    @When("the trainer levels up {string} by {int}")
    public void theTrainerLevelsUpBy(String pokemonName, int levelUpAmount) {
        pokemon.levelUp(levelUpAmount);
    }

    @Then("{string}'s level should be {int}")
    public void pokemonSLevelShouldBe(String pokemonName, int expectedLevel) {
        int actualLevel = pokemon.getLevel();
        Assert.assertEquals("Unexpected Pokemon level", expectedLevel, actualLevel);
    }
}
