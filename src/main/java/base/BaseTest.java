package base;

import SoFT.Login.Login;
import Tutorial.L1.L1;
import Tutorial.L2.L2;
import se.soprasteria.automatedtesting.webdriver.api.base.BaseTestCase;
import se.soprasteria.automatedtesting.webdriver.api.base.BaseTestConfig;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;

public class BaseTest extends BaseTestCase {
    protected L1 l1Page;
    protected L2 l2Page;
    protected Login loginPage;

    @Override
    protected String getDriverConfigId() {
        return "chromedriver";
    }

    @Override
    protected String getConfigFile() {
        return "Config.xml";
    }

    @Override
    protected void initPages(AutomationDriver driver) {
        l1Page = PageFactory.getL1Page(driver);
        l2Page = PageFactory.getL2Page(driver);
        loginPage = PageFactory.getLoginPage(driver);
        logger.info("Initialising pages to be used in test");
    }

    @Override
    protected void initializeDriver(AutomationDriver driver) {
        if (driver.isWeb()) {
            driver.navigate().to(BaseTestConfig.getConfigurationOption("url_mainpage"));
        } else if (driver.isAndroid()){
            driver.navigate().to("");
        } else if (driver.isIos()){
            driver.navigate().to("");
        }
        sleep(1000);
        logger.info("Navigated to page, sleeping for 1s to allow it to initiliaze");
    }
}
