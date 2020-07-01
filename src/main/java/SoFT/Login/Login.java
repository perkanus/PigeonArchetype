package SoFT.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import se.soprasteria.automatedtesting.webdriver.api.base.BasePageObject;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;

import java.io.IOException;

public class Login extends BasePageObject implements Login_Interface {
    @FindBy(xpath = "//*[@id='component_uppgifter_gridBodyContainer']")
    protected WebElement uppgifterTabell;

    @FindBy(xpath = "//*[@id='TabnavTabLogoTextId']")
    protected WebElement CRMButton;

    @FindBy(xpath = "//*[@id='TabCS-main']")
    protected WebElement ArendehanteringButton;


    public Login(AutomationDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageLoaded() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        try
        {

            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt( "contentIFrame0"));
            wait.until(ExpectedConditions.elementToBeClickable(uppgifterTabell));
            driver.switchTo().defaultContent();
            wait.until(ExpectedConditions.elementToBeClickable(CRMButton));
            drawBorder(CRMButton, "red", 5);
            sleep(2000);
            wait.until(ExpectedConditions.elementToBeClickable(ArendehanteringButton));
            drawBorder(ArendehanteringButton, "blue", 5);
            //wait.until(ExpectedConditions.elementToBeClickable(CRMButton)).click();
            //sleep(5000);

        }
        catch (Exception ex)
        {
            logger.error("Shit happened in Login.isPageLoaded()");
            return false;
        }
        // TODO: IMPLEMENT
        logger.info("Verifying that the login has occured.");
        return true;


        //return elementHelper.isElementDisplayedWithinTime(loginButton, 5000);
    }


    public boolean performLogin(){
        try {
            ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\AutoIt3\\AutoIt3.exe", "C:\\work\\Username.au3");
            Process p = pb.start();
            sleep(2000);
            logger.info("Typed username");
            ProcessBuilder pa = new ProcessBuilder("C:\\Program Files (x86)\\AutoIt3\\AutoIt3.exe", "C:\\work\\password.au3");
            Process p_a = pa.start();
            logger.info("Typed password");
            return true;
        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
            return false;
        }
    }

    public void drawBorder(String xpath, String color, int width) {
        WebElement element_node = driver.findElement(By.xpath(xpath));
        driver.executeJavaScript("arguments[0].style.border='"+ width + "px solid " + color + "'", element_node);
    }

    public void drawBorder(WebElement element_node, String color, int width) {
        driver.executeJavaScript("arguments[0].style.border='"+ width + "px solid " + color + "'", element_node);
    }
}
