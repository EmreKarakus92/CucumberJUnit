package com.cydeo.pages.AEPages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AEHomePage {
    public AEHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[1]/div/a/img")
    public WebElement automationExerciseImg;

    @FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    public WebElement signupLoginButton;

    @FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    public WebElement buttonDeleteAccount;

    @FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
    public  WebElement linkLoggedInUsername;


}

