package com.canal.rapport;

import com.canal.rapport.Rapport;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

public class RapportStepdefs {

    public Rapport rapport;

    public String result ;

    @Given("^Create a FizzBuzz game play$")
    public void createAFizzBuzzGamePlay() {
        rapport= new Rapport();
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int number) {
        result = rapport.play(number);
    }

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String resultString) throws Throwable {
        Assertions.assertEquals(result,resultString);
    }
}
