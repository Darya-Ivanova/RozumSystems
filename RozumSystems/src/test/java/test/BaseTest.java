package test;

import Pages.MainPage;
import core.BrowserDriver.BrowserFactory;
import core.Utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected MainPage mainPage;

    @BeforeClass(alwaysRun = true)
    public void startBrowser() {
        startDriver();
    }

    @AfterClass(alwaysRun = true)
    public void closeBrowser() {
        closeDriver();
        Log.info("Конец теста в: " + getClass().getSimpleName() + "\n");
    }

    protected void startDriver() {
        driver = new BrowserFactory().getWebDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.speedtest.net/");
        mainPage= PageFactory.initElements(driver, MainPage.class);
    }

    protected void closeDriver() {
        driver.quit();
    }
}
