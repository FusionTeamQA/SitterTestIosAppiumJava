package LoginPage;

import Setting.BaseIOSTest;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.util.Random;

public class SignUpFamily extends BaseIOSTest {


    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        Random random = new Random();
        int n = random.nextInt(1000) +3;

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
        driver.findElementByAccessibilityId("Sign Up").click();
        Thread.sleep(1500);
        driver.findElementByAccessibilityId("Family").click();
        Thread.sleep(1500);
        driver.findElementByXPath("//XCUIElementTypeOther[@name='Email Address:']/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField").sendKeys("AutoTestfamily"+n+"@example.com");
        driver.findElementByXPath("//XCUIElementTypeOther[@name='Password']/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField").sendKeys("qweqweqwe");
        driver.findElementByXPath("//XCUIElementTypeOther[@name='Re-enter Password']/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField").sendKeys("qweqweqwe");
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Select Option'])[3]").click();
        driver.findElementByName("Instagram").click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Select Option'])[6]").click();
        driver.findElementByName("Atlanta, Georgia").click();
        driver.findElementByXPath("//XCUIElementTypeOther[@name='Email Address: Password Re-enter Password How did you hear about us? Select Option Metro Area Atlanta, Georgia']/XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]").click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Next'])[1]").click();


    }
    }