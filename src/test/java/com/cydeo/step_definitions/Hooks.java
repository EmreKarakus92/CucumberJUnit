package com.cydeo.step_definitions;

import com.cydeo.pages.AEPages.*;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before (value = "@Regression")
    public void setupMethod(){
        System.out.println("this code fragment is executed by Cucumbers before method");
    }

    @BeforeStep(value = "@AETask")
    public void setupPageObject(){
        AELoginPage aeLoginPage = new AELoginPage();
        AEHomePage aeHomePage = new AEHomePage();
        AESignupPage aeSignupPage = new AESignupPage();
        AEAccountCreatedPage aeAccountCreatedPage = new AEAccountCreatedPage();
        AEDeleteAccountPage aeDeleteAccountPage = new AEDeleteAccountPage();

    }


}
