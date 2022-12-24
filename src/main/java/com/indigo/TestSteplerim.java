package com.indigo;

import org.openqa.selenium.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import static com.indigo.Driver.getDriver;
import static com.indigo.WebElements.Indigo_WebElementlerim.*;


public class TestSteplerim extends ClassObjectlerim {

    //TEST STEP 01- TS01
    public void launchChromeBrowser_and_navigateToTheUrl() {
        try {
            System.out.println("STEP1-launchChromeBrowser_and_navigateToTheUrl step Initialized");
            getDriver().get(Constants.URL);
            System.out.println("STEP1 -launchChromeBrowser_and_navigateToTheUrl has done!");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("STEP1'DE HATA OLUSMUSTUR!");

        }
    }


    public void searchForTheBook_inIndigo() {
        try {
            System.out.println("STEP2-searchForTheBook_inIndigo Initialized");

           try {
               //burada ilk olarak webelementi webPage buldu
               //2.-> locate edilen webElementi "stayInTheKnowPopUpClose_button" isimli degiskene atadi
               //3.->webDriverWait(webelement,string) methodu calisti
               waitUtil.webDriverWait(stayInTheKnowPopUpClose_button = getWebElement("stayInTheKnowPopUpClose_button"), "visibility");//Implicitly wait

               //bir kere locate edilen ve "stayInTheKnowPopUpClose_button"e atanan webelementi artik boyle kullanabiliriz.
               //her defasinda->getWebElement("stayInTheKnowPopUpClose_button") diye de kullanabiliriz.
               //Ama bu sefer projemizin performansi kotu olur
               stayInTheKnowPopUpClose_button.click();

           } catch (NoSuchElementException e){
               System.out.println("POP UP CIKMAMISTIR, TESTE DEVAM ET");
           }

            (searchBar_textBox = getWebElement("searchBar_textBox")).sendKeys(Constants.KITAP);


            //1.yol Bu kullanim duzgun calismiyor
            //searchBar_textBox.sendKeys(Keys.ENTER);

            //actions "ClassObjectlerim" den inherit edilmistir
            //2.yol  Bu kullanim da duzgun calismiyor
            //actions.sendKeys(Keys.ENTER);

            //3.yol- Bu kullanim duzgun calismiyor
            //JavascriptExecutor js = (JavascriptExecutor)getDriver();
            //String script = "document.getElementById('header__quick-search').value += '" + Keys.ENTER + "';";
            //js.executeScript(script);

            //4.yol
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);


            System.out.println("STEP2-searchForTheBook_inIndigo has done!");

        } catch (Exception e) {
            System.out.println(e.getMessage());

            System.out.println("STEP2'DE HATA OLUSMUSTUR!");
        }
    }


    public void enter(){
        try {
            System.out.println("STEP2.1-searchForTheBook_inIndigo Initialized");
            searchBar_textBox.sendKeys(Keys.ENTER);
            System.out.println("STEP2.1-searchForTheBook_inIndigo has done!");
        } catch (Exception e){
            System.out.println("STEP2.1'DE HATA OLMUSTUR!");
        }
    }


    public  void clickAddToCartButton() {
        try {
            System.out.println("STEP3 -> clickAddToCartButton- initialized ");

            waitUtil.webDriverWait(addToCart_button=getWebElement("addToCart_button"),"clickability");//Implicitly wait
            addToCart_button.click();
            System.out.println("STEP3 -clickAddToCartButton has done!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("STEP3'te HATA olusmustur!");

        }
    }



    public  void clickViewMyCartButton()  {
        try {
            System.out.println("STEP4 -> clickViewMyCartButton initialized!");


            waitUtil.webDriverWait(viewCartButton=getWebElement("viewCartButton"),"visibility");//Implicitly wait
            viewCartButton.click();
            //loginPopUp.click();

            System.out.println("STEP4 -clickViewMyCartButton has done!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("STEP4'te HATA olusmustur!");
        }
    }



    public void proceedToCheckOut() {
        try {
            System.out.println("STEP5 -proceedToCheckOut initialized!");

            waitUtil.webDriverWait("","");//Implicitly wait

            //HEM ATAMA/ASSIGN HEM DE ACTION YAPTIRIYORUZ
            (proceedToCheckOutButton=getWebElement("proceedToCheckOutButton")).click();

            System.out.println("STEP5 -proceedToCheckOut has done!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("STEP5'te HATA olusmustur!");

        }
    }


        public void putMyCredentialsToLogin() {
        try {
            System.out.println("STEP6 -putMyCredentialsToLogin- initialize edilmistir ");

            (login_emailTextbox=getWebElement("login_emailTextbox")).sendKeys(Constants.EMAIL);
            (login_passwordTextbox=getWebElement("login_passwordTextbox")).sendKeys(Constants.PASS);
            getWebElement("signInButton").click();

            System.out.println("STEP6 -putMyCredentialsToLogin has done!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("STEP6'te HATA olusmustur!");

        }
    }

}

