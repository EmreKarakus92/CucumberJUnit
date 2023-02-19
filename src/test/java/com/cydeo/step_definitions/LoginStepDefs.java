package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    @And("user enter librarian username")
    public void userEnterLibrarianUsername() {
        System.out.println("enter library username");

    }

    @And("user enter librarian password")
    public void userEnterLibrarianPassword() {
        System.out.println("enter librarian password");
    }


    @Then("user should see the dashboard")
    public void userShouldSeeTheDashboard() {
        System.out.println("see the dashboard");
    }


    @And("user enter student username")
    public void userEnterStudentUsername() {
        System.out.println("student username");
    }

    @And("user enter student password")
    public void userEnterStudentPassword() {
        System.out.println("student password");
    }

    @And("user enter admin username")
    public void userEnterAdminUsername() {
        System.out.println("admin username");
    }

    @And("user enter admin password")
    public void userEnterAdminPassword() {
        System.out.println("admin password");
    }


    @Given("user is on library login page")
    public void userIsOnLibraryLoginPage() {
        System.out.println("Common On library page");

    }
}
