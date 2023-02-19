package com.cydeo.pages.AEPages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AEAccountCreatedPage {

    public AEAccountCreatedPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div/h2/b")
    public WebElement textAccountCreated;

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    public WebElement buttonContinue;

    @FindBy (xpath = "//*[@id=\"dismiss-button\"]/div")
    public WebElement buttonDismissed;



}
