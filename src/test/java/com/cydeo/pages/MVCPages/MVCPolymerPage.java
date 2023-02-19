package com.cydeo.pages.MVCPages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MVCPolymerPage {

    public MVCPolymerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@id='new-todo']")
    public WebElement inputBoxWhatNeedsToBeDone;

    @FindBy (xpath = "(//label[@class='style-scope td-item'])[2]")
    public WebElement secondItem ;

    @FindBy (xpath = "(//input[@id='edit'])")
    public WebElement inputBoxEdit;

}
