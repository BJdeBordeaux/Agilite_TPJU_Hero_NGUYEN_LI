package stepDefinitions;

import hero.SpecialHero;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefsUS002SpecialHero {
    private SpecialHero specialHero;

    @Given("a SpecialHero with strength {int}")
    public void aSpecialHeroWithStrength(int strength) {
        specialHero = new SpecialHero("SpecialHero", strength);
    }

    @When("the strength is increased by {int}")
    public void iIncreaseHisOrHerStrengthBy(int increaseAmount) {
        specialHero.setStrength(specialHero.getStrength() + increaseAmount);
    }

    @Then("the strength should be {int}")
    public void theStrengthShouldBe(int expectedStrength) {
        assertEquals(expectedStrength, specialHero.getStrength());
    }

    @Given("a SpecialHero named {string} with strength {int}")
    public void aSpecialHeroNamedWithStrength(String name, int strength) {
        specialHero = new SpecialHero(name, strength);
    }

    @When("I increase {string}'s strength by {int}")
    public void iIncreaseSpecialHeroStrengthBy(String heroName, int strengthIncrease) {
        assertEquals(heroName, specialHero.getName());
        specialHero.setStrength(specialHero.getStrength() + strengthIncrease);
    }

    @When("the {string}'s strength increases by {int}")
    public void trainerIncreasesSpecialHeroStrengthBy(String heroName, int strengthIncrease) {
        assertEquals(heroName, specialHero.getName());
        specialHero.setStrength(specialHero.getStrength() + strengthIncrease);
    }

    @Then("{string}'s strength should be {int}")
    public void specialHeroStrengthShouldBe(String heroName, int expectedStrength) {
        assertEquals(heroName, specialHero.getName());
        assertEquals(expectedStrength, specialHero.getStrength());
    }
}
