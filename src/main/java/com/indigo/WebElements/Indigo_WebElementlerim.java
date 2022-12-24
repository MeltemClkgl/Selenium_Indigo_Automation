package com.indigo.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.indigo.Driver.getDriver;

public class Indigo_WebElementlerim
{

    static public WebElement stayInTheKnowPopUpClose_button;
    static public WebElement searchBar_textBox;
    static public WebElement addToCart_button;
    static public WebElement login_emailTextbox;
    static public WebElement login_passwordTextbox;
    static public WebElement viewCartButton;
    static public WebElement proceedToCheckOutButton;


    public static WebElement getWebElement(String webElement) throws MyWebElementNameIsWrongException {

        WebElement element=null;

        switch (webElement) {
            case "stayInTheKnowPopUpClose_button":
                element=getDriver().findElement(By.xpath("//button[@class=\"browsepopup-closebtn\"]"));
                //2.locator
                // 3.locator
                // 4.locator
                // 5.locator
                break;
            case "searchBar_textBox":
                element=getDriver().findElement(By.name("SearchBoxKeywords"));break;
            case "addToCart_button":
                element=getDriver().findElement(By.xpath("/html/body/form/main/div[1]/section/div/div/div/div/div[2]/section[2]/div/div/div/div[5]/div/div[1]/div[2]/div[5]/span/button"));break;
            case "viewCartButton":
                element= getDriver().findElement(By.xpath("/html/body/div[10]/div[2]/div[2]/div[3]/a/span"));break;
            case "proceedToCheckOutButton":
                element= getDriver().findElement(By.xpath("//*[.=\"Proceed to Checkout\"]"));break;
               //element= getDriver().findElement(By.xpath("//*[@id=\"cart-proceedToCheckOut-button\"]"));break;


            case "login_emailTextbox":
                element=getDriver().findElement(By.id("sign-in-email"));break;
                //element=getDriver().findElement(By.id("browseCart-signInPopup-emailTextbox"));break;
            case "login_passwordTextbox":
                element=getDriver().findElement(By.id("sign-in-password"));break;
                //element= getDriver().findElement(By.id("browseCart-signInPopup-passwordTextbox"));break;
            case "signInButton":
                element= getDriver().findElement(By.xpath("//button[text()='Sign In']"));break;
                //element= getDriver().findElement(By.className("js-clickSignIn-button"));break;
            default:
                throw new MyWebElementNameIsWrongException("Given String parameter is wrong");
        }

        return element;
    }


}

