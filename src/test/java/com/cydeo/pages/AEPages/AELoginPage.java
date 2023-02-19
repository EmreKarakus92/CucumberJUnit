package com.cydeo.pages.AEPages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AELoginPage {
    public AELoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div[3]/div/h2")
    public WebElement newUserSignupText;

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
    public WebElement surnameInputBox;

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
    public WebElement emailInputBox;

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
    public WebElement signupButton;

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div[1]/div/h2")
    public WebElement textLoginIntoYourAccount;

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")
    public WebElement inputBoxUsername;

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")
    public WebElement inputBoxPassword;

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/button")
    public WebElement buttonLogin;








}

