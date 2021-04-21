package Tutorial.L1;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import se.soprasteria.automatedtesting.webdriver.api.base.BasePageObject;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;



public class L1 extends BasePageObject implements L1_Interface {


    @FindBy (xpath = "//*[@id=\"block_contact_infos\"]/div/ul/li[3]/i")
    protected WebElement emailLogo;

    @FindBy (xpath = "//*[@id=\"header_logo\"]/a/img")
    protected WebElement homeLogo;

    @FindBy (id = "searchbox")
    protected WebElement searchBox;




    public L1(AutomationDriver driver) {
        super(driver);
    }

    public boolean isPageLoaded() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(emailLogo));
            //emailLogo.click();
            return true;
        } catch (Exception e){
            logger.error("KEVIN "+e.getMessage());
            return false;
        }

    }




    public boolean FindLogo() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(homeLogo)).click();
            return true;
        }
        catch (Exception e){
            logger.error("Johnny B good"+e.getMessage());
            return false;
        }
        finally {
            logger.info("Fade på fredag!");

        }
    }


    public boolean F1() {
        return true;
    }

    public boolean F2() {
        logger.error("WTF!");
        return false;
    }


}
