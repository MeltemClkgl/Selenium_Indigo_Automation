package com.indigo;


import com.indigo.ReusableMethods.WaitUtility;
import org.openqa.selenium.interactions.Actions;

import static com.indigo.Driver.getDriver;

public class ClassObjectlerim {


    public static TestSteplerim testStepMethodlari = new TestSteplerim();
    public static WaitUtility waitUtil = new WaitUtility();
    public static Actions actions=new Actions(getDriver());


}
