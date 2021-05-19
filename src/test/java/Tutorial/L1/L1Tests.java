package Tutorial.L1;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;

public class L1Tests extends BaseTest {
    @Test(dataProvider = "getDriver", groups = {"standard"}, priority = 0)
    public void IsPageLoaded(AutomationDriver driver)  {
        Assert.assertTrue(l1Page.isPageLoaded(), "loginPage.performLogin() failed");

    }

    @Test(dataProvider = "getDriver", groups = {"standard"}, priority = 0)
    public void FindSearchItems(AutomationDriver driver)  {
        Assert.assertTrue(l1Page.isPageLoaded(), "loginPage.performLogin() failed");
        Assert.assertTrue(l1Page.FindLogo(),"Doesn't work");
        Assert.assertTrue(l1Page.FindSearch(),"Doesn't");
        sleep(2000);


    }

    public String[] grejer = {"Dress", "Summer", "Casual"};

    @Test(dataProvider = "getDriver")
    public void SearchByButton(AutomationDriver driver){
        for(int i = 0; i < grejer.length; i++)
        {
            Assert.assertTrue(l1Page.SearchByButton(grejer[i]),"SearchByButton Failed!");
            logger.error("Söker efter " + grejer[i]);
        }
        Assert.assertTrue(l1Page.isPageLoaded(),"loginPage.performlogin");
        Assert.assertTrue(l1Page.SearchByButton(),"SearchByButton Failed!");
    }

    @Test(dataProvider = "getDriver")
    public void SearchByEnter(AutomationDriver driver){
        Assert.assertTrue(l1Page.isPageLoaded(),"loginPage.performlogin");
        Assert.assertTrue(l1Page.SearchByEnter(),"SearchByEnter Failed!");

    }

    @Test(dataProvider = "getDriver")
    public void SelectInMenu(AutomationDriver driver){
        Assert.assertTrue(l1Page.isPageLoaded(),"loginPage.performlogin");
        Assert.assertTrue(l1Page.SelectInMenu(L1.menuItems.WOMEN),"SearchByEnter Failed!");
        Assert.assertTrue(l1Page.SelectInMenu(L1.menuItems.DRESSES),"SearchByEnter Failed!");
        Assert.assertTrue(l1Page.SelectInMenu(L1.menuItems.T_SHIRTS),"SearchByEnter Failed!");

    }

}
