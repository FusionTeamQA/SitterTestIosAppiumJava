package LoginPage;

import Setting.BaseIOSTest;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;

public class LoginPage extends BaseIOSTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        IOSDriver driver = DesiredCapabilities();
        Thread.sleep(3000);
        driver.findElementByAccessibilityId("Allow").click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
        Thread.sleep(1500);
        driver.quit();
        System.out.println("Login Page Open - Success");
    }
}