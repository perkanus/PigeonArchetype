package Data;

import Tutorial.L1.L1;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestData {

    public String[] dataStructureOne = {"Dress", "Summer", "Casual"};

    public enum menuItems {
        WOMEN, DRESSES, T_SHIRTS
    }






    public enum menuItems2 {
        START, TILLSTAND, SJUKRESEKORT, UPPGIFTER
    }


    public enum Menu {
        WOMEN(null),
        TOPS(WOMEN),
        DRESSES(WOMEN),
        DRESSESMAIN(null),
        CASUAL(DRESSESMAIN),
        EAVNING(DRESSESMAIN),
        SUMMER(DRESSESMAIN),
        TSHIRT(null),

        ;
        private Menu parent = null;

        private Menu(Menu parent) {
            this.parent = parent;
        }
    }



/*
    public boolean selectInMenu13(TestData.Menu item) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        try {
            switch (item) {
                case Tillstand:
                    wait.until(ExpectedConditions.elementToBeClickable(tillstandtMenu)).click();
                    break;
                case Skapa:
                    wait.until(ExpectedConditions.elementToBeClickable(skapaTillstandMenu)).click();
                    break;
                case Sok:
                    wait.until(ExpectedConditions.elementToBeClickable(sokTillstandMenu)).click();
                    break;
            }
            return true;
        } catch (Exception e) {
            logger.error("Johnny B good" + e.getMessage());
            return false;
        }
    }


*/


}
