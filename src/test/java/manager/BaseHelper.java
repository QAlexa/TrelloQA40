package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseHelper {
    public WebElement findelEmentBase(By by) {
        return ApplicationManager.getDriver().findElement(by);
    }
    public void clickBase(By by) {
        findelEmentBase(by).click();
    }
    public void sendKeysBase(By by,String text) {
        WebElement el = findelEmentBase(by);
        el.click();
        el.clear();
        el.sendKeys(text);
    }

    public boolean isTextActualEqualToExpected(By by, String text) {
        if(findelEmentBase(by).getText().toUpperCase().trim().equals(text.toUpperCase().trim())) {
            return true;
        }else {
            System.out.println("actual result "+findelEmentBase(by).getText().toUpperCase().trim()
                    +"expected result "+text.toUpperCase().trim());
            return false;
        }
    }
}
