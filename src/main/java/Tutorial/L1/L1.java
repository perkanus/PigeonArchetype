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
    // NY(TT) Resenär knapp
    //
    @FindBy(xpath = "//*[@id=\"textinput\"]")
    protected WebElement webElement_editInput;

    @FindBy(xpath = "//*[@id=\"search-icon-legacy\"]")
    protected WebElement webElement_buttonSearch;


    public L1(AutomationDriver driver) {
        super(driver);
    }

    public boolean isPageLoaded() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        try
        {
            wait.until(ExpectedConditions.elementToBeClickable(By.id("//*[@id=\"showelement\"]"))).click();
            sleep(10000);
            wait.until(ExpectedConditions.elementToBeClickable(webElement_editInput));
            drawBorder(webElement_editInput, "red", 2);
            sleep(5000);
             /*
            wait.until(ExpectedConditions.elementToBeClickable(webElement_buttonSearch));
            drawBorder(webElement_buttonSearch, "red", 2);
            sleep(5000);
            */



        }
        catch (Exception ex)
        {
            logger.error("Shit happened in Login.isPageLoaded()");
            return false;
        }
        // TODO: IMPLEMENT
        logger.info("Verifying that the login has occured.");
        return true;
    }

    public void drawBorder(String xpath, String color, int width) {
        WebElement element_node = driver.findElement(By.xpath(xpath));
        driver.executeJavaScript("arguments[0].style.border='"+ width + "px solid " + color + "'", element_node);
    }

    public void drawBorder(WebElement element_node, String color, int width) {
        driver.executeJavaScript("arguments[0].style.border='"+ width + "px solid " + color + "'", element_node);
    }

    public boolean F1() {
        return false;
    }

    public boolean F2() {
        return false;
    }
}
