package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Base;
import pages.SkodaPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkodaStepdefinitions extends Base {

    SkodaPage skodaPage=new SkodaPage();


    @Given("Kullanıcı {string} adresli sayfaya gider")
    public void kullanıcı_adresli_sayfaya_gider(String string) {
        Driver.getDriver().get(string);

    }


    @Given("Kullanıcı {string} tıklar")
    public void kullanıcıTıklar(String text) {
        ReusableMethods.textIleClick(text);
        ReusableMethods.bekle(2);

    }

    @Given("Kullanıcı {string} {string} göründüğünü test eder")
    public void kullanıcıGöründüğünüTestEder(String oge, String oge2) {
        Assert.assertTrue(ReusableMethods.textIleIsDisplay(oge));
        Assert.assertTrue(ReusableMethods.textIleIsDisplay(oge2));;
    }

    @Given("Kullanıcı sayfayı kapatır")
    public void kullanıcıSayfayıKapatır() {
        Driver.quitDriver();
    }


    @Given("Kullanıcı {string} göründüğünü test eder")
    public void kullanıcı_göründüğünü_test_eder(String skoda) {

        Assert.assertTrue(ReusableMethods.textIleIsDisplay(skoda));;
    }


    @Given("Kullanıcı {string} {string} {string} göründüğünü test eder")
    public void kullanıcı_göründüğünü_test_eder(String string, String string2, String string3) {
        List <String> ogele =new ArrayList<String>();
        ogele.add(string);
        ogele.add(string3);
        ogele.add(string2);
            for (int i = 0; i < ogele.size(); i++) {
                Assert.assertTrue(ReusableMethods.textIleIsDisplay(ogele.get(i)));;
            }



    }

    @Given("Kullanıcı tarih seçer")
    public void kullanıcı_tarih_seçer() {
        skodaPage.tarihSimgesi.click();
        skodaPage.sagOkTusu.click();
        ReusableMethods.textIleClick(String.valueOf(8));
    }

}


