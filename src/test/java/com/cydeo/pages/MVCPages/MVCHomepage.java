package com.cydeo.pages.MVCPages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MVCHomepage {

    public MVCHomepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//div[.='JavaScript']")
    public WebElement buttonJavaScript ;

    @FindBy (xpath = "//a[.='Polymer']")
    public WebElement linkPolymer ;

}
