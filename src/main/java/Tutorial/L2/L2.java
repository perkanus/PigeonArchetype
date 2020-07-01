package Tutorial.L2;

import se.soprasteria.automatedtesting.webdriver.api.base.BasePageObject;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;

public class L2 extends BasePageObject implements L2_Interface {
    public L2(AutomationDriver driver) {
        super(driver);
    }

    public boolean isSoFTGood() {
        return false;
    }

    public boolean isPageLoaded() {
        return false;
    }
}
