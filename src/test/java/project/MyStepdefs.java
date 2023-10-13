package project;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.*;

public class MyStepdefs {

    String str;

    @Given("I have a string {string}")
    public void iHaveAStringAbc(String arg0) {
        str = arg0;
    }


    @When("I reverse the string")
    public void iReverseTheString() {
        StringManagement stringManagement = new StringManagement();
        str = stringManagement.stringreverse(str);
    }

    @Then("I should get {string}")
    public void iShouldGetCba(String arg0) {
        Assert.assertEquals(arg0, str);
    }

    @When("I Capitailize the string")
    public void iCapitailizeTheString() {
        StringManagement stringManagement = new StringManagement();
        str = stringManagement.Captilize(str);
    }

    @When("I Change to lowercase the string")
    public void iChangeToLowercaseTheString() {
        StringManagement stringManagement = new StringManagement();
        str = stringManagement.ToLowerCase(str);
    }
}
