package com.indigo.Scenarios;

import com.indigo.ClassObjectlerim;

public class SelectTheBook_AddToCart extends ClassObjectlerim
{

    

    public static void main(String[] args) throws InterruptedException {



        //TEST CASE 1 - TC01
        testStepMethodlari.launchChromeBrowser_and_navigateToTheUrl();//TEST STEP1 - TS01
        testStepMethodlari.searchForTheBook_inIndigo();//TEST STEP2 -TS02
        testStepMethodlari.enter();//TEST STEP2 -TS03
        testStepMethodlari.clickAddToCartButton();//TEST STEP3
        testStepMethodlari.clickViewMyCartButton();//TEST STEP4
        testStepMethodlari.proceedToCheckOut();//TEST STEP5
        testStepMethodlari.putMyCredentialsToLogin();//TEST STEP6



    }


}
