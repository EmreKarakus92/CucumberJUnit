package com.cydeo.step_definitions;

import com.cydeo.pages.MVCPages.MVCHomepage;
import com.cydeo.pages.MVCPages.MVCPolymerPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class MVCStepDefs {

    MVCHomepage mvcHomepage ;
    MVCPolymerPage mvcPolymerPage ;
    @When("users are home page")
    public void usersAreHomePage() {
        Driver.getDriver().get("https://todomvc.com/");
    }

    @And("users click javascript button")
    public void usersClickJavascriptButton() {
        mvcHomepage = new MVCHomepage();
        mvcHomepage.buttonJavaScript.click();
    }

    @And("users select polymer link")
    public void usersSelectPolymerLink() {
        mvcHomepage.linkPolymer.click();
    }

    @And("users add two items to the list")
    public void usersAddTwoItemsToTheList() {
        mvcPolymerPage = new MVCPolymerPage();
        mvcPolymerPage.inputBoxWhatNeedsToBeDone.sendKeys("emre"+ Keys.ENTER);
        mvcPolymerPage.inputBoxWhatNeedsToBeDone.sendKeys("merve"+ Keys.ENTER);
        Assert.assertTrue(mvcPolymerPage.secondItem.isDisplayed());
    }

    @And("users are able to edit the list")
    public void usersAreAbleToEditTheList() {
        Actions actions = new Actions(Driver.getDriver());
        String oldTextValue = mvcPolymerPage.secondItem.getText();
        actions.doubleClick(mvcPolymerPage.secondItem).perform();
        String s = Keys.chord(Keys.CONTROL,"a");
        //mvcPolymerPage.secondItem.sendKeys(Keys.chord(Keys.CONTROL,"a") + Keys.BACK_SPACE);
        mvcPolymerPage.inputBoxEdit.sendKeys(s);
        mvcPolymerPage.inputBoxEdit.sendKeys("Leyla");
        String newTextValue = mvcPolymerPage.secondItem.getText();
        Assert.assertFalse(oldTextValue.equals(newTextValue));
    }
}
