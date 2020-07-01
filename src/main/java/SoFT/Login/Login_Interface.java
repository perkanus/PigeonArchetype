package SoFT.Login;

import org.openqa.selenium.WebElement;

public interface Login_Interface {
    public abstract boolean isPageLoaded ();
    public abstract boolean performLogin();
    public abstract void drawBorder(String xpath, String color, int width);
    public abstract void drawBorder(WebElement element_node, String color, int width);
}
