package Pages;

import core.Utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {

    @FindBy(xpath = ".//a [@aria-label='start speed test - connection type multi']")
    private WebElement button;
    @FindBy(xpath = "//span [@class='result-data-large number result-data-value ping-speed']")
    private WebElement ping;
    @FindBy(xpath = ".//span  [@class='result-data-large number result-data-value download-speed']")
    private WebElement download;
    @FindBy(xpath = ".//span  [@class='result-data-large number result-data-value upload-speed']")
    private WebElement upload;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void start() throws InterruptedException {
        button.click();
        Log.info("Click");
        Thread.sleep(60000);
        Log.info("Ping " + ping.getText() +"     Download " + download.getText() + "    Upload " + upload.getText());
    }
}
