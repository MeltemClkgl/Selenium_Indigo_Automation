package com.indigo.ReusableMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.indigo.Constants.DEFAULT_WAIT_DURATION;
import static com.indigo.Driver.getDriver;

public class WaitUtility
{

    public void webDriverWait(Object webElement, String condition)
    {
        //local variable=method'a ait variable en basta default deger de olsa initialize edilmelidir
        WebDriverWait wait = null;

        if(!condition.isEmpty())
              wait = new WebDriverWait(getDriver(), Duration.ofSeconds(DEFAULT_WAIT_DURATION));

        switch (condition)
        {
            case "visibility":
                wait.until(ExpectedConditions.visibilityOfAllElements((WebElement) webElement));break;
            case "clickability":
                wait.until(ExpectedConditions.elementToBeClickable((WebElement) webElement));break;
            case "":
                getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(DEFAULT_WAIT_DURATION));break;

        }
    }
}
