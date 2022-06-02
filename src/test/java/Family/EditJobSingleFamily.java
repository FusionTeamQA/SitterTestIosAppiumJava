package Family;

import Setting.BaseIOSTest;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static Setting.BaseIOSTest.login_family;
import static org.junit.Assert.assertTrue;

public class EditJobSingleFamily {
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
            driver.findElementByAccessibilityId("Edit Job").click();
            Thread.sleep(2000);
            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd, MM, yyyy HH:mm:ss");
            System.out.println(dateTime.format(formatter));
            driver.findElementByXPath("//XCUIElementTypeOther[@name='Notes (visible to all sitters)']/XCUIElementTypeOther/XCUIElementTypeTextView").clear();
            Thread.sleep(1500);
            driver.findElementByXPath("//XCUIElementTypeOther[@name='Notes (visible to all sitters)']/XCUIElementTypeOther/XCUIElementTypeTextView").sendKeys("AutoTestEdit job from:" + dateTime.format(formatter));
            Thread.sleep(2500);
            driver.findElementByAccessibilityId("End Time").click();
            Thread.sleep(1000);
            driver.findElementByXPath("(//XCUIElementTypeOther[@name='Review Booking'])[1]").click();
            Thread.sleep(2000);
            driver.findElementByXPath("(//XCUIElementTypeOther[@name='Save Changes'])[2]").click();
            Thread.sleep(5000);
            String HomePage = driver.findElementByAccessibilityId("Upcoming").getText();
            System.out.println(HomePage);
            driver.quit();
            System.out.println("Job edit success");
        } catch (Exception exception) {
            {
                System.out.println(exception);
                driver.quit();

            }
        }
    }
}
