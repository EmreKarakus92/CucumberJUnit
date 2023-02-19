package com.cydeo.pages.AEPages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AEDeleteAccountPage {
    public AEDeleteAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div/h2/b")
    public WebElement textAccountDeleted;

    @FindBy (xpath = "//a[.='Continue']")
    public WebElement buttonContinue;
}
