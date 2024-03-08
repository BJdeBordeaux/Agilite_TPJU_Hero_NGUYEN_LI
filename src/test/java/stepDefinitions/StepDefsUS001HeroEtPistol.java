package stepDefinitions;
import io.cucumber.java.en.*;
import hero.Hero;
import static org.junit.jupiter.api.Assertions.*;

public class StepDefsUS001HeroEtPistol {
    private Hero currentHero;

    @Given("a hero has {int} without a pistol")
    public void unHeroSansPistol(int power) {
        currentHero = new Hero();
        currentHero.setPuissance(power);
    }

    @When("he has no pistol")
    public void avoirAucunPistol() {

    }

    @Then("he should  have {int} power")
    public void devoirAvoirPuissanceSouhaitee(int power)  {
        assertEquals(power, currentHero.getPuissance());
    }
}
