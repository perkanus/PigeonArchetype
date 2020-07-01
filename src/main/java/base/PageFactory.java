package base;

import SoFT.Login.Login;
import Tutorial.L1.L1;
import Tutorial.L2.L2;
import org.openqa.selenium.WebDriver;
import se.soprasteria.automatedtesting.webdriver.api.utility.Errors;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;

public class PageFactory {
    public static L1 getL1Page(AutomationDriver driver) {
        if (driver.isWeb()) {
            return new L1(driver);
        }
        if (driver.isAndroid()) {
            //return Android login page
        }
        if (driver.isIos()) {
            //return iOS login page
        }
        throw new RuntimeException(getInvalidDriverError(driver));
    }

    public static L2 getL2Page(AutomationDriver driver) {
        if (driver.isWeb()) {
            return new L2(driver);
        }
        if (driver.isAndroid()) {
            //return Android login page
        }
        if (driver.isIos()) {
            //return iOS login page
        }
        throw new RuntimeException(getInvalidDriverError(driver));
    }

    public static Login getLoginPage(AutomationDriver driver) {
        if (driver.isWeb()) {
            return new Login(driver);
        }
        if (driver.isAndroid()) {
            //return Android login page
        }
        if (driver.isIos()) {
            //return iOS login page
        }
        throw new RuntimeException(getInvalidDriverError(driver));
    }

    private static String getInvalidDriverError(WebDriver webDriver) {
        String[] fixes = {"Change webdriver configuration to a valid one for this project",
                "Implement support for webdriver: " + webDriver.toString()};
        return Errors.getErrorMessage("Tried to start unsupported webdriver", fixes);
    }
}
