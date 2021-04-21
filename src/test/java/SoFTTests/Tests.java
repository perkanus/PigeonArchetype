package SoFTTests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;

public class Tests extends BaseTest {
    @Test(dataProvider = "getDriver", groups = {"standard"}, priority = 0)
    public void Login(AutomationDriver driver)  {
        Assert.assertTrue(loginPage.isPageLoaded(), "loginPage.performLogin() failed");

    }
}
