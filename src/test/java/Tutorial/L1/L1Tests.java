package Tutorial.L1;

import Data.TestData;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;

public class L1Tests extends BaseTest {

    public TestData testData = new TestData();

    @Test(dataProvider = "getDriver", groups = {"standard"}, priority = 0)
    public void IsPageLoaded(AutomationDriver driver)  {
        Assert.assertTrue(l1Page.isPageLoaded(), "loginPage.performLogin() failed");

    }

    @Test(dataProvider = "getDriver", groups = {"standard"}, priority = 0)
    public void FindSearchItems(AutomationDriver driver)  {
        Assert.assertTrue(l1Page.isPageLoaded(), "loginPage.performLogin() failed");
        Assert.assertTrue(l1Page.FindLogo(),"Doesn't work");
        Assert.assertTrue(l1Page.FindSearch(),"Doesn't");
        sleep(2000);


    }



    @Test(dataProvider = "getDriver")
    public void SearchByButton(AutomationDriver driver){
        for(int i = 0; i < testData.dataStructureOne.length; i++)
        {
            Assert.assertTrue(l1Page.SearchByButton(testData.dataStructureOne[i]),"SearchByButton Failed!");
            logger.error("Söker efter " + testData.dataStructureOne[i]);
        }
        Assert.assertTrue(l1Page.isPageLoaded(),"loginPage.performlogin");
        Assert.assertTrue(l1Page.SearchByButton(),"SearchByButton Failed!");
    }

    @Test(dataProvider = "getDriver")
    public void SearchByEnter(AutomationDriver driver){
        Assert.assertTrue(l1Page.isPageLoaded(),"loginPage.performlogin");
        Assert.assertTrue(l1Page.SearchByEnter(),"SearchByEnter Failed!");

    }

    @Test(dataProvider = "getDriver")
    public void SelectInMenu(AutomationDriver driver){
        Assert.assertTrue(l1Page.isPageLoaded(),"loginPage.performlogin");
        Assert.assertTrue(l1Page.SelectInMenu(TestData.menuItems.WOMEN),"SearchByEnter Failed!");
        Assert.assertTrue(l1Page.SelectInMenu(TestData.menuItems.DRESSES),"SearchByEnter Failed!");
        Assert.assertTrue(l1Page.SelectInMenu(TestData.menuItems.T_SHIRTS),"SearchByEnter Failed!");

    }

    @Test(dataProvider = "getDriver")
    public void SelectInMenuAdvanced(AutomationDriver driver){
        Assert.assertTrue(l1Page.isPageLoaded(),"loginPage.performlogin");
        Assert.assertTrue(l1Page.SelectInMenuAdvanced(TestData.Menu.WOMEN),"SearchByEnter Failed!");
        //Assert.assertTrue(l1Page.SelectInMenuAdvanced(TestData.Menu.TOPS),"SearchByEnter Failed!");
        //fÖRSÖK ATT FÅ FRAM HOVER FUNKTIONALITET GENOM JSKRIPT
        Assert.assertTrue(l1Page.SelectInMenuAdvanced(TestData.Menu.DRESSESMAIN),"SearchByEnter Failed!");
        Assert.assertTrue(l1Page.SelectInMenuAdvanced(TestData.Menu.TSHIRT),"SearchByEnter Failed!");
        //Assert.assertTrue(l1Page.SelectInMenuAdvanced(TestData.Menu.CASUAL),"SearchByEnter Failed!");


    }

}
