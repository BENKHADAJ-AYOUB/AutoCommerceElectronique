package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomaPage;
import pages.MobilePage;

public class HomePageTest extends TestBase{
    //Instance HomePage
    HomaPage homaPage;
    MobilePage mobilePage;
    //Verfier le title de la page
    @Test(priority = 1)
    public void verifyTitlePage()
    {
        homaPage = new HomaPage(driver);
        System.out.println(homaPage.titlePage);
        Assert.assertTrue(homaPage.titlePage.contains("Home"));
    }
    @Test(priority = 2)
    public void verifyClickOnMobile()
    {
        homaPage.clickOnMobile();
        mobilePage = new MobilePage(driver);
        Assert.assertTrue(mobilePage.titlePage.contains("Mobile"));


    }

}
