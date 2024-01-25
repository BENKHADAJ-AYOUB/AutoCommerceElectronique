package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomaPage;
import pages.MobilePage;

public class MobileTest extends TestBase{
    HomaPage homaPage;
    MobilePage mobilePage;

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
    @Test(priority = 3, dependsOnMethods = "verifyClickOnMobile")
    public void verfifyListProductSortedByName()
    {
       boolean isSorted = mobilePage.isSortedByName();
        System.out.println(isSorted);
       Assert.assertTrue(isSorted);
    }
}
