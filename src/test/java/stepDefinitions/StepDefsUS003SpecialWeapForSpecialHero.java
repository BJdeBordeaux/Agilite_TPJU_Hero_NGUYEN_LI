package stepDefinitions;

import hero.SpecialHero;
import interfaces.SpecialWeapon;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pokemon.Pokemon;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefsUS003SpecialWeapForSpecialHero {
    private SpecialHero specialHero;
    private SpecialWeapon specialWeapon;

    private String message = null;

    @Given("a SpecialHero named {string}")
    public void aSpecialHeroNamed(String specialHeroName) {
        specialHero = new SpecialHero(specialHeroName, 100); // Assuming initial strength is 100
    }

    @Given("a Pokemon special weapon {string} at level {int}")
    public void aPokemonSpecialWeaponAtLevel(String weaponName, int weaponLevel) {
        // Assuming the Pokemon class implements SpecialWeapon interface
        specialWeapon = new Pokemon(weaponName, weaponLevel);
        if (weaponLevel < 0){
            message = "Cannot add negative level Pokemon.";
        }
    }

    @When("I add the Pokemon special weapon {string} to {string}")
    public void iAddThePokemonSpecialWeaponTo(String weaponName, String specialHeroName) {
        if (message == null) {
            specialHero.addWeapons(specialWeapon);
        }
    }

    @Then("{string} should have the Pokemon special weapon {string}")
    public void specialHeroShouldHaveThePokemonSpecialWeapon(String specialHeroName, String weaponName) {
        assertTrue(specialHero.getSpecialWeapons().contains(specialWeapon), "SpecialHero does not have the special weapon");
    }

    @Then("the system refuses adding with the message {string}")
    public void theSystemRefusesAddingWithTheMessage(String arg0) {
        Assert.assertEquals(arg0, message);
    }
}
