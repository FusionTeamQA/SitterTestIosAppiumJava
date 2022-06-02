package Family;

import Setting.BaseIOSTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;

import static Setting.BaseIOSTest.login_family;
import static org.junit.Assert.assertTrue;

public class ApplicantsViewJob {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        IOSDriver driver = BaseIOSTest.DesiredCapabilities();
        Thread.sleep(5000);
        try {
            Thread.sleep(3000);
            driver.findElementByAccessibilityId("Allow").click();//Alert Allow
            Thread.sleep(1000);
            driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
            driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
            driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
            driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
            driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
            driver.findElementByXPath("(//XCUIElementTypeOther[@name='Email: Password:  Forgot Username or Password? Login'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
            Thread.sleep(1500);
            driver.findElementByXPath("//XCUIElementTypeOther[@name='Email:']/XCUIElementTypeOther/XCUIElementTypeTextField").sendKeys(login_family);
            Thread.sleep(2500);
            driver.findElementByXPath("//XCUIElementTypeOther[@name='Password:']/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField").sendKeys("qweqweqwe");
            Thread.sleep(2500);
            driver.findElementByXPath("//XCUIElementTypeOther[@name='Login']").click();
            Thread.sleep(5000);
            driver.findElementByXPath("(//XCUIElementTypeOther[@name='No Sitter Selected APPLICANTS Sat, Dec 31st 4:30a - 7:30a'])[3]").click();
            Thread.sleep(2000);
            driver.findElementByAccessibilityId("View Job").click();
            Thread.sleep(2000);
            String YellowBanner = driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Sitters available']").getText();
            assertTrue(YellowBanner.contains("Sitters available")); //отображение баннера
            Thread.sleep(1000);
            driver.quit();
            System.out.println("view job - opened");
        } catch (Exception exception) {
            {
                System.out.println(exception);
                driver.quit();

            }
        }
    }
}
