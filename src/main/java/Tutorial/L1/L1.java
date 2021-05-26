package Tutorial.L1;

import Data.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import se.soprasteria.automatedtesting.webdriver.api.base.BasePageObject;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;



public class L1 extends BasePageObject implements L1_Interface {

    private boolean VISUAL_DEBUG =true;


    @FindBy (xpath = "//*[@id=\"block_contact_infos\"]/div/ul/li[3]/i")
    protected WebElement emailLogo;

    @FindBy (xpath = "//*[@id=\"header_logo\"]/a/img")
    protected WebElement homeLogo;

    @FindBy (id = "search_query_top")
    protected WebElement searchBox;

    @FindBy (name = "submit_search")
    protected WebElement searchButton;








    public L1(AutomationDriver driver) {
        super(driver);
    }


    @Override
    public void drawBorder(String xpath){
        WebElement element_node = driver.findElement(By.xpath(xpath));
        driver.executeJavaScript("arguments[0].style.border='3px solid red'", element_node);
    }
    @Override
    public void drawBorder(WebElement element_node){
        driver.executeJavaScript("arguments[0].style.border='3px solid red'", element_node);
    }

    @Override
    public void drawBorder(WebElement element_node, String color, int width) {
        driver.executeJavaScript("arguments[0].style.border='"+ width + "px solid " + color + "'", element_node);
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
            if (VISUAL_DEBUG)
                drawBorder(homeLogo, "green", 5);
                //drawBorder(homeLogo);
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

    public boolean FindSearch() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(searchBox));
            wait.until(ExpectedConditions.elementToBeClickable(searchButton));
            if (VISUAL_DEBUG)
            {
                drawBorder(searchBox);
                drawBorder(searchButton);
            }
            return true;
        }
        catch (Exception e){
            logger.error("Johnny B good"+e.getMessage());
            return false;
        }
        finally {
            logger.info("Searchbox found");

        }
    }

    public boolean SearchByButton(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(searchBox)).clear();
            wait.until(ExpectedConditions.elementToBeClickable(searchBox)).sendKeys("Dress");
            wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
            if (VISUAL_DEBUG)
            {
                drawBorder(searchBox);
                drawBorder(searchButton);
            }
            return true;
        }
        catch (Exception e){
            logger.error("Johnny B good"+e.getMessage());
            return false;
        }
        finally {
            logger.info("Searchbox found");

        }
    }

    @Override
    public boolean SearchByButton(String searchItem) {
        WebDriverWait wait = new WebDriverWait(driver,20);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(searchBox)).clear();
            wait.until(ExpectedConditions.elementToBeClickable(searchBox)).sendKeys(searchItem);
            wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
            if (VISUAL_DEBUG)
            {
                drawBorder(searchBox);
                drawBorder(searchButton);
            }
            return true;
        }
        catch (Exception e){
            logger.error("Johnny B good"+e.getMessage());
            return false;
        }
        finally {
            logger.info("Searchbox found");

        }
    }

    public boolean SearchByEnter(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(searchBox)).clear();
            wait.until(ExpectedConditions.elementToBeClickable(searchBox)).sendKeys("Dress");
            wait.until(ExpectedConditions.elementToBeClickable(searchBox)).sendKeys(Keys.ENTER);
            if (VISUAL_DEBUG)
            {
                drawBorder(searchBox);
            }
            return true;
        }
        catch (Exception e){
            logger.error("Johnny B good"+e.getMessage());
            return false;
        }
        finally {
            logger.info("Searchbox found");

        }
    }



    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    protected WebElement womenMenu;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    protected WebElement dressesMenu;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    protected WebElement tshirtsMenu;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/a")
    protected WebElement topsMenu;
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a")
    protected WebElement casualMenu;

    public boolean SelectInMenu(TestData.menuItems item){
        WebDriverWait wait = new WebDriverWait(driver,20);
        try {
            switch (item)
            {
                case WOMEN:
                    wait.until(ExpectedConditions.elementToBeClickable(womenMenu)).click();
                    break;
                case DRESSES:
                    wait.until(ExpectedConditions.elementToBeClickable(dressesMenu)).click();
                    break;
                case T_SHIRTS:
                    wait.until(ExpectedConditions.elementToBeClickable(tshirtsMenu)).click();
                    break;
                    default:
                    break;
            }
            return true;
        }
        catch (Exception e){
            logger.error("Johnny B good"+e.getMessage());
            return false;
        }
        finally {
            logger.info("Searchbox found");

        }
    }

    @Override
    public boolean SelectInMenuAdvanced (TestData.Menu items2){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        try {
            switch (items2) {
                case WOMEN:
                    wait.until(ExpectedConditions.elementToBeClickable(womenMenu)).click();
                    break;
                case DRESSESMAIN:
                    wait.until(ExpectedConditions.elementToBeClickable(dressesMenu)).click();
                    break;
                case TSHIRT:
                    wait.until(ExpectedConditions.elementToBeClickable(tshirtsMenu)).click();
                    break;
                case TOPS:
                    wait.until(ExpectedConditions.elementToBeClickable(topsMenu)).click();
                    break;
                case CASUAL:
                    wait.until(ExpectedConditions.elementToBeClickable(casualMenu)).click();
                default:
                    break;
            }
            return true;
        } catch (Exception e) {
            logger.error("Johnny B good" + e.getMessage());
            return false;
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
