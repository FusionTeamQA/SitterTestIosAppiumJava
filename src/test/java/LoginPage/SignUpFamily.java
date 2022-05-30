package LoginPage;

import Setting.BaseIOSTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.util.Random;

public class SignUpFamily extends BaseIOSTest {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        Random random = new Random();
        int n = random.nextInt(1000) +3;

        final String newFamily = "AutoTestfamily" +n +"@example.com";
        final String newSitter = "AutoTestSitter" +n +"@example.com";

        IOSDriver driver = BaseIOSTest.DesiredCapabilities();
        Thread.sleep(4000);
        driver.findElementByAccessibilityId("Allow").click();//Alert Allow
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
        Thread.sleep(1500);
        driver.findElementByAccessibilityId("Sign Up").click();
        Thread.sleep(1500);
        driver.findElementByAccessibilityId("Family").click();
        Thread.sleep(1500);
        driver.findElementByXPath("//XCUIElementTypeOther[@name='Email Address:']/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField").sendKeys(newFamily);
        driver.findElementByXPath("//XCUIElementTypeOther[@name='Password']/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField").sendKeys(pass_signup);
        Thread.sleep(3000);
        MobileElement closekeyboard1 = (MobileElement) driver.findElementByAccessibilityId("How did you hear about us?");
        driver.findElementByXPath("//XCUIElementTypeOther[@name='Re-enter Password']/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField").sendKeys(pass_signup);
        Thread.sleep(2000);
        MobileElement closekeyboard2 = (MobileElement) driver.findElementByAccessibilityId("How did you hear about us?");
        closekeyboard2.click();
        Thread.sleep(1500);
        MobileElement HowDropDown = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Select Option\"])[1]");
        HowDropDown.click();
        Thread.sleep(1000);
        MobileElement selectGoogle = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Google\"])[1]");
        selectGoogle.click();
        Thread.sleep(1000);
        MobileElement MetroDropDown = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Select Option\"])[3]");
        MetroDropDown.click();
        Thread.sleep(1000);
        MobileElement selectAtlanta = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Atlanta, Georgia\"])[2]");
        selectAtlanta.click();
        Thread.sleep(3000);
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Metro Area");
        el2.click();
        Thread.sleep(2000);
        MobileElement NextBottomSignUp = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name='Next'])[2]");
        NextBottomSignUp.click();

    }
    }