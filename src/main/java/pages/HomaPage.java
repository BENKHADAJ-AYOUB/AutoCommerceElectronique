package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomaPage extends PageBase{
    public String titlePage;
    public HomaPage(WebDriver driver) {
        super(driver);
        titlePage = driver.getTitle();
    }

    //WebElement HomePage
    @FindBy(xpath = "//a[normalize-space()='Mobile']")
    WebElement mobileElement;
    //Click Mobile
    public void clickOnMobile()
    {
        Clicking(mobileElement);
    }
}
