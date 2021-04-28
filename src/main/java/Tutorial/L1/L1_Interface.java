package Tutorial.L1;

import org.openqa.selenium.WebElement;

public interface L1_Interface {

    public abstract boolean F1();
    public abstract boolean F2();
    public abstract boolean FindLogo();
    public abstract void drawBorder(String xpath);
    public abstract void drawBorder (WebElement element_node);
    public abstract boolean FindSearch();
    public abstract boolean SearchByEnter();
    public abstract boolean SearchByButton();
    public abstract boolean SelectInMenu(L1.menuItems item);
}
