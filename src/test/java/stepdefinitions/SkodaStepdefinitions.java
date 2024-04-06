package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.Base;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkodaStepdefinitions extends Base {


    @Given("Kullanıcı {string} adresli sayfaya gider")
    public void kullanıcı_adresli_sayfaya_gider(String string) {
        Driver.getDriver().get(string);

    }


    @Given("Kullanıcı {string} tıklar")
    public void kullanıcıTıklar(String text) {
        ReusableMethods.textIleClick(text);

    }

    @Given("Kullanıcı {string} {string} göründüğünü test eder")
    public void kullanıcıGöründüğünüTestEder(String oge, String oge2) {
        ReusableMethods.textIleIsDisplay(oge);
        ReusableMethods.textIleIsDisplay(oge2);
    }

    @Given("Kullanıcı sayfayı kapatır")
    public void kullanıcıSayfayıKapatır() {
        Driver.quitDriver();
    }


    @Given("Kullanıcı {string} göründüğünü test eder")
    public void kullanıcı_göründüğünü_test_eder(String skoda) {
        ReusableMethods.textIleIsDisplay(skoda);
    }


    @Given("Kullanıcı {string} {string} {string} göründüğünü test eder")
    public void kullanıcı_göründüğünü_test_eder(String string, String string2, String string3) {
        List <String> ogele =new ArrayList<String>();
        ogele.add(string);
        ogele.add(string3);
        ogele.add(string2);
            for (int i = 0; i < ogele.size(); i++) {
                ReusableMethods.textIleIsDisplay(ogele.get(i));
            }



    }
}


