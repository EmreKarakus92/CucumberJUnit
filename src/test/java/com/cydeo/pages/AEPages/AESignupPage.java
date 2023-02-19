package com.cydeo.pages.AEPages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AESignupPage {
    public AESignupPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div/div[1]/h2/b")
    public WebElement enterAccountInformationText;

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div/div[1]/form/div[1]/div[1]/label")
    public WebElement radioButtonMr;

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div/div[1]/form/div[1]/div[2]/label")
    public WebElement radioButtonMrs;

    @FindBy (xpath = "//*[@id=\"password\"]")
    public WebElement inputBoxPassword;

    @FindBy (xpath = "//*[@id=\"days\"]")
    public WebElement selectedDropdownDay;

    @FindBy (xpath = "//*[@id=\"months\"]")
    public WebElement selectedDropdownMonth;

    @FindBy (xpath = "//*[@id=\"years\"]")
    public WebElement selectedDropdownYear;

    @FindBy (xpath = "//*[@id=\"newsletter\"]")
    public WebElement checkBoxNewsLetters;

    @FindBy (id = "optin")
    public WebElement checkBoxSpecialOffers;

    @FindBy (xpath = "//button[.='Create Account']")
    public WebElement buttonCreateAccount;







}

