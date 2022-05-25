package LoginPage;

import Setting.BaseIOSTest;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;

public class LoginPage extends BaseIOSTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        IOSDriver driver = DesiredCapabilities();
        Thread.sleep(3000);
        driver.findElementByAccessibilityId("Allow").click();
        driver.quit();
    }
}