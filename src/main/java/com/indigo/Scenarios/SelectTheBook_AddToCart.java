package com.indigo.Scenarios;

import com.indigo.ClassObjectlerim;

public class SelectTheBook_AddToCart extends ClassObjectlerim
{

    //INTELLIJ'DEKI JAVA-MAVEN-SELENIUM FRAMEWORK'UMDE SUANLIK SADECE 1 TEST(SCENARIO) VARDIR.
    //O DA BU CLASIN ICINDE ASAGIDAKI GIBIDIR

    public static void main(String[] args) throws InterruptedException {

        //Benim 1 tane TESTCASE'IM VAR.
        //SCENARIO'su Indigo websitesinden kitap secip, sepete eklemektir.
        //Bu testcase'im 6 tane TEST STEP'ten olusmaktadir.


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
