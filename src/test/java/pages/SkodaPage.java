package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkodaPage extends Base {

@FindBy(xpath = "(//*[@*='DatePickerstyle__PickerDayMonthButton-sc-8rvd3n-5 jeWEUx'])[4]")
    public WebElement sagOkTusu;

@FindBy(xpath = "(//*[@*='0 0 48 48'])[5]")
    public WebElement tarihSimgesi;

}
