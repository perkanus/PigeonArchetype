package Tutorial.L1;

import base.BaseTest;
import se.soprasteria.automatedtesting.webdriver.api.base.BasePageObject;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;

public class L1 extends BasePageObject implements L1_Interface {

    public L1(AutomationDriver driver) {
        super(driver);
    }

    public boolean isPageLoaded() {
        return false;
    }

    public boolean F1() {
        return true;
    }

    public boolean F2() {
        logger.error("WTF!");
        return false;
    }
}
