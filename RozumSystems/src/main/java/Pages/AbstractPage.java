package Pages;

import org.openqa.selenium.*;

public abstract class AbstractPage {

    private WebDriver driver;

    public AbstractPage(WebDriver driver){
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return this.driver;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
