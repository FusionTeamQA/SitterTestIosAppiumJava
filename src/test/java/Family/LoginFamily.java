package Family;
import Setting.BaseIOSTest;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;

import static Setting.BaseIOSTest.login_family;
import static Setting.BaseIOSTest.pass_family;

public class LoginFamily {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

            IOSDriver driver = BaseIOSTest.DesiredCapabilities();
            Thread.sleep(3000);
            driver.findElementByAccessibilityId("Allow").click();//Alert Allow
            driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
            driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
            driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
            driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
            driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
            driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
            Thread.sleep(1500);
            driver.findElementByXPath("//XCUIElementTypeOther[@name='Email:']/XCUIElementTypeOther/XCUIElementTypeTextField").sendKeys(login_family);
            driver.findElementByXPath("//XCUIElementTypeOther[@name='Password:']/XCUIElementTypeOther").sendKeys(pass_family);
            Thread.sleep(1500);
            driver.findElementByAccessibilityId("Login").click();

        }
    }
