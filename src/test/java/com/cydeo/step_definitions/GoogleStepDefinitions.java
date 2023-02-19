package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepDefinitions {
    @When("user is on google page")
    public void user_is_on_google_page() {
        System.out.println("On google page");
        Driver.getDriver().get("https://www.google.com/");
    }
    @When("user should see the title is google")
    public void user_should_see_the_title_is_google() {
        System.out.println("See the title");
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google" ;
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
