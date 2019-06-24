package test;


import core.Utils.Log;
import core.Utils.TestProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class MainTest extends BaseTest {


    @Test(priority = 2)
    public void sendPackage() throws InterruptedException {
        mainPage.start();
    }

}
