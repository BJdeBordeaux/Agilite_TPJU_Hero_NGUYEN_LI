package herowithcucumber;
import io.cucumber.java.en.*;
import hero.Hero;
import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
    private Hero currentHero;
    private int actualAnswer;

    @Given("a hero has {int} without a pistol")
    public void a_hero_has_without_a_pistol(int power) {
        currentHero = new Hero();
        currentHero.setPuissance(power);
    }

    @When("he has no pistol")
    public void i_ask_whether_it_s_Friday_yet() {

    }

    @Then("he should  have {int} power")
    public void he_should_have_power(int power)  {
        assertEquals(power, currentHero.getPuissance());
    }
}
