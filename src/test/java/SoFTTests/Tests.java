package SoFTTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;

public class Tests extends BaseTest {

    @Test(dataProvider = "getDriver", groups = {"standard"}, priority = 0)
    public void Login(AutomationDriver driver)  {
        Assert.assertTrue(loginPage.performLogin(), "loginPage.performLogin() failed");
        Assert.assertTrue(loginPage.isPageLoaded(), "loginPage.performLogin() failed");

    }
}
