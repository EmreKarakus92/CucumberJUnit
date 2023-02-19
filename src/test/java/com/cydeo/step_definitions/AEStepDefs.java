package com.cydeo.step_definitions;

import com.cydeo.pages.AEPages.*;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AEStepDefs {

    AELoginPage aeLoginPage;
    AEHomePage aeHomePage;
    AESignupPage aeSignupPage;
    AEAccountCreatedPage aeAccountCreatedPage;
    AEDeleteAccountPage aeDeleteAccountPage;
    Faker faker;
    @When("user is on automationexercise.com home page")
    public void user_is_on_automationexercise_com_home_page() {

        Driver.getDriver().get("https://automationexercise.com/");

    }
    @When("user should see the home page")
    public void user_should_see_the_home_page() {
        aeHomePage = new AEHomePage();
        Assert.assertTrue(aeHomePage.automationExerciseImg.isDisplayed());
    }
    @When("user clicks on signup-login button")
    public void user_clicks_on_signup_login_button() {
        aeHomePage.signupLoginButton.click();

    }
    @When("user should see New User Signup! text")
    public void user_should_see_new_user_signup_text() {
        aeLoginPage = new AELoginPage();
        Assert.assertTrue(aeLoginPage.newUserSignupText.isDisplayed());
    }
    @When("user enters username")
    public void user_enters_username() {
        aeLoginPage.surnameInputBox.sendKeys("Emre");
    }
    @When("user enters password")
    public void user_enters_password() {
        aeLoginPage.emailInputBox.sendKeys("eemrekara8721@gmail.com");
    }
    @When("user clicks on signup")
    public void user_clicks_on_signup() {
        aeLoginPage.signupButton.click();
    }
    @When("user should see ENTER ACCOUNT INFORMATION text")
    public void user_should_see_enter_account_information_text() {
        aeSignupPage = new AESignupPage();
        Assert.assertTrue(aeSignupPage.enterAccountInformationText.isDisplayed());
    }
    @When("user enters Title Name Email Password Date of birth information")
    public void user_enters_title_name_email_password_date_of_birth_information() {
        faker = new Faker();
        int number = faker.number().numberBetween(1,2);
        if(number == 1) aeSignupPage.radioButtonMr.click();
        if(number == 2) aeSignupPage.radioButtonMrs.click();

        String password = faker.bothify("####???###");
        aeSignupPage.inputBoxPassword.sendKeys(password);

        Select dayDropdown = new Select(aeSignupPage.selectedDropdownDay);
        dayDropdown.selectByIndex(faker.number().numberBetween(1,29));
        Select monthDropdown = new Select(aeSignupPage.selectedDropdownMonth);
        monthDropdown.selectByIndex(faker.number().numberBetween(1,11));
        Select yearDropdown = new Select(aeSignupPage.selectedDropdownYear);
        yearDropdown.selectByIndex(faker.number().numberBetween(1,100));


    }
    @When("user select Sign up for our newsletter! checkbox")
    public void user_select_sign_up_for_our_newsletter_checkbox() {
        /*Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeSelected(aeSignupPage.checkBoxNewsLetters));
        aePages.checkBoxNewsLetters.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(aeSignupPage.checkBoxNewsLetters.isSelected());*/
        System.out.println("it should be asked");
    }
    @When("user select Receive special offers from our partners! checkbox")
    public void user_select_receive_special_offers_from_our_partners_checkbox() {
        // actions = new Actions(Driver.getDriver());
        //actions.moveToElement(aeSignupPage.checkBoxSpecialOffers).click().perform();
        //aePages.checkBoxSpecialOffers.click();
        //Assert.assertTrue(aeSignupPage.checkBoxSpecialOffers.isSelected());
        System.out.println("it should be asked");
    }
    @When("user fills Fill details: First name Last name Company Address Address2 Country State City Zipcode Mobile Number")
    public void user_fills_fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        Driver.getDriver().findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("emre");
        Driver.getDriver().findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("kara");
        Driver.getDriver().findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("blackbird");
        Driver.getDriver().findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("asdf");
        Driver.getDriver().findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("azsxdc");
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//*[@id=\"country\"]")));
        select.selectByIndex(2);
        Driver.getDriver().findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Turkey");
        Driver.getDriver().findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("eeeee");
        Driver.getDriver().findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("aaaa");
        Driver.getDriver().findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("bbbbb");


    }
    @When("user clicks Create Account button")
    public void user_clicks_create_account_button() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(aeSignupPage.buttonCreateAccount));
        actions.moveToElement(aeSignupPage.buttonCreateAccount).click().perform();
        Thread.sleep(3000);
        if(Driver.getDriver().getTitle().contains("Signup")){
            actions.moveToElement(aeSignupPage.buttonCreateAccount).click().perform();
        }
        Thread.sleep(3000);
        String title = Driver.getDriver().getTitle();
        System.out.println("title = " + title);
        boolean c1 = Driver.getDriver().getTitle().equals("Automation Exercise - Account Created");
        while(!c1){
            Driver.getDriver().navigate().back();
            aeSignupPage.inputBoxPassword.sendKeys("123456");
            actions.moveToElement(aeSignupPage.buttonCreateAccount).click().perform();
            if(Driver.getDriver().getTitle().equals("Automation Exercise - Account Created")){
                c1 = true;
                break;
            }
        }



    }
    @When("user should see ACCOUNT CREATED! text")
    public void user_should_see_account_created_text() {
        aeAccountCreatedPage = new AEAccountCreatedPage();
        Assert.assertTrue(aeAccountCreatedPage.textAccountCreated.isDisplayed());

    }
    @When("user clicks continue button")
    public void user_clicks_continue_button() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(aeAccountCreatedPage.buttonContinue).click().perform();
        Driver.getDriver().navigate().refresh();
        actions.moveToElement(aeAccountCreatedPage.buttonContinue).click().perform();
    }
    @When("user should see Logged in as username text")
    public void user_should_see_logged_in_as_username_text() {
        System.out.println("Look Here");
    }
    @When("user clicks Delete Account button")
    public void user_clicks_delete_account_button() throws InterruptedException {
        aeHomePage.buttonDeleteAccount.click();
        Thread.sleep(2000);
        Driver.getDriver().navigate().refresh();
    }
    @Then("user should see ACCOUNT DELETED! text and click Continue button")
    public void user_should_see_account_deleted_text_and_click_continue_button() {
        aeDeleteAccountPage = new AEDeleteAccountPage();
        Assert.assertTrue(aeDeleteAccountPage.buttonContinue.isDisplayed());
        aeDeleteAccountPage.buttonContinue.click();
        Assert.assertTrue(aeHomePage.automationExerciseImg.isDisplayed());
    }


    @And("user should see Login to your account text")
    public void userShouldSeeLoginToYourAccountText() {
        aeLoginPage = new AELoginPage();
        System.out.println(aeLoginPage.textLoginIntoYourAccount.getText());
        Assert.assertTrue(aeLoginPage.textLoginIntoYourAccount.isDisplayed());
    }

    @And("user enter correct email and password")
    public void userEnterCorrectEmailAndPassword() {
        String email = "emre1@gmail.com";
        String password = "123456" ;
        aeLoginPage.inputBoxUsername.sendKeys(email);
        aeLoginPage.inputBoxPassword.sendKeys(password);

    }

    @And("user click login button")
    public void userClickLoginButton() {
        aeLoginPage.buttonLogin.click();
    }

    @And("user should see the logged in as username")
    public void userShouldSeeTheLoggedInAsUsername() {
        String username = "emre1" ;
        Assert.assertTrue(aeHomePage.linkLoggedInUsername.getText().contains(username));

    }
}
