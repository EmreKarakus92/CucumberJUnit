package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

    public static void sleep(double seconds) {
        try {
            long time = (long) seconds * 1000;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle) {

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        for (String windowHandle : windowHandles) {

            Driver.getDriver().switchTo().window(windowHandle);

            if (Driver.getDriver().getCurrentUrl().contains(expectedInTitle)) {
                break;
            }

        }

    }

    public static void switchToWindow(String targetTitle) {
        String originHandle = Driver.getDriver().getWindowHandle();
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String windowHandle : windowHandles) {
            Driver.getDriver().switchTo().window(windowHandle);
            if (Driver.getDriver().getTitle().contains(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(originHandle);
    }

    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public static List<String> getElementsText(List<WebElement> elements) {
        List<String> elementTextLink = new ArrayList<>();
        for (WebElement element : elements) {
            elementTextLink.add(element.getText());
        }
        return elementTextLink;
    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickAblility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));

    }












}
