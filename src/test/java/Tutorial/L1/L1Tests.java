package Tutorial.L1;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;

public class L1Tests extends BaseTest {
    @Test(dataProvider = "getDriver", groups = {"standard"}, priority = 0)
    public void L1T1(AutomationDriver driver)  {
        Assert.assertTrue(l1Page.isPageLoaded(), "loginPage.performLogin() failed");
    }
}
