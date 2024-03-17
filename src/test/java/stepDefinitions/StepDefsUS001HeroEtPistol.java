package stepDefinitions;
import io.cucumber.java.en.*;
import hero.Hero;
import static org.junit.jupiter.api.Assertions.*;

public class StepDefsUS001HeroEtPistol {
        private Hero currentHero;

        @Given("a hero has {int} without a pistol")
        public void aHeroWithoutAPistol(int power) {
            currentHero = new Hero();
            currentHero.setStrength(power);
        }

        @When("he has no pistol")
        public void havingNoPistol() {
            // No action needed for this step
        }

        @Then("he should  have {int} power")
        public void shouldHaveDesiredPower(int power)  {
            assertEquals(power, currentHero.getStrength());
        }

}
