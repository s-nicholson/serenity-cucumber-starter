package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DummyStepDefinitions {
    private int result = 0;

    @Given("a test for {string}")
    public void given(String feature) {
        assertThat(feature, startsWith("Feature"));
    }

    @When("we add {int} and {int}")
    public void when(int a, int b) {
        result = a + b;
    }

    @Then("then we get {int}")
    public void then(int expected) {
        assertThat(result, is(expected));
    }
}
