package com.indigo;


import com.indigo.ReusableMethods.WaitUtility;
import org.openqa.selenium.interactions.Actions;

import static com.indigo.Driver.getDriver;

public class ClassObjectlerim {


    public static TestSteplerim testStepMethodlari = new TestSteplerim();
    public static WaitUtility waitUtil = new WaitUtility();
    public static Actions actions=new Actions(getDriver());



    //PROJEMDE BELLI CLASSLARIM VAR.
    //HER CLASSIN KENDINE GORE BIR AMACI/GOREVI VAR.
    //EGER BIR CLASSIN ICINDEKI METHOD YA DA DEGISKENE OBJE ILE ERISMEM GEREKIYORSA TUM HAZIR OBJELERIMI BURADA DEPOLARIM
    //IHTIYAC DUYDUKCA "ClassObjectlerim" CLASSINI EXTENDS EDIP BURADAKI OBJECTLERIMI KULLANIRIM.



    //MESELA
    //SelectTheBook_AddToCart Class'i
    //TestSteplerim           Class'i
    //bu classimi extends edip kullanmistir.
}
