package Family;

import Setting.BaseIOSTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static Setting.BaseIOSTest.login_family;
import static org.junit.Assert.assertTrue;

public class PostJobValidation {
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
            MobileElement plusbutton = (MobileElement) driver.findElementByAccessibilityId(", tab, 3 of 5");
            plusbutton.click();
            Thread.sleep(3000);
            String HowOftenString = driver.findElementByXPath("//XCUIElementTypeStaticText[@name='How often do you need a sitter?']").getText();
            assertTrue(HowOftenString.contains("How often do you need a sitter?"));
            MobileElement SingleJob = (MobileElement) driver.findElementByAccessibilityId("Single Job One day for any sitter");
            SingleJob.click();
            Thread.sleep(1500);
            MobileElement ClickContinue = (MobileElement) driver.findElementByAccessibilityId("Continue");
            ClickContinue.click();
            Thread.sleep(1500);
            MobileElement ReviewBookingClick = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name='Review Booking'])[1]");
            ReviewBookingClick.click();
            Thread.sleep(1000);
            String BannerRedStartDate = driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Start Date Required.']").getText();
            assertTrue(BannerRedStartDate.contains("Start Date Required."));
            driver.quit();
            System.out.println("Show after clicking SUBMIT button if the requred field is not fill");
        } catch (Exception exception) {
            {
                System.out.println(exception);
                driver.quit();

            }
        }
    }


}
