package Family;
import Setting.BaseIOSTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriverException;

import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static Setting.BaseIOSTest.login_family;
import static Setting.BaseIOSTest.pass_family;
import static org.junit.Assert.assertTrue;

public class PostJobSingleFamily {

        public static void main(String[] args) throws MalformedURLException, InterruptedException {

                IOSDriver driver = BaseIOSTest.DesiredCapabilities();
                Thread.sleep(5000);
                try {
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
                        Thread.sleep(2500);
                        driver.findElementByXPath("//XCUIElementTypeOther[@name='Password:']/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField").sendKeys(pass_family);
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
                        driver.findElementByAccessibilityId("Start Date Select Date").click();
                        Thread.sleep(2000);
                        LocalDate date = LocalDate.now(); // Gets the current date
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
                        System.out.println("today" + date.format(formatter));
                        Thread.sleep(1500);
                        driver.findElementByXPath("(//XCUIElementTypeOther[@name='May 2022 Sun Mon Tue Wed Thu Fri Sat 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31'])[2]")
                                .sendKeys(date.format(formatter));
                        Thread.sleep(2500);
                        driver.findElementByAccessibilityId("Start Time Select Time").click();
                        Thread.sleep(1000);
                        driver.findElementByAccessibilityId("Confirm").click();
                        Thread.sleep(1000);
                        driver.findElementByXPath("//XCUIElementTypeOther[@name='Notes (visible to all sitters)']/XCUIElementTypeOther/XCUIElementTypeTextView").sendKeys("AutoTest Notes");
                        Thread.sleep(1000);
                        MobileElement closekeyboard = (MobileElement) driver.findElementByAccessibilityId("End Time");
                        closekeyboard.click();
                        Thread.sleep(1000);
                        MobileElement ReviewBookingClick = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name='Review Booking'])[1]");
                        ReviewBookingClick.click();
                        Thread.sleep(1000);
                        String JobSummary2 = driver.findElementByAccessibilityId("Notes: AutoTest Notes").getText();
                        assertTrue(JobSummary2.contains("Notes: AutoTest Notes"));//проверка заметки
                        Thread.sleep(1000);
                        MobileElement GoPayment = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name='Go to Payment'])[2]");
                        GoPayment.click();
                        String BannerSitterPass = driver.findElementByXPath("//XCUIElementTypeStaticText[@name='You saved $20 with Sitter Pass']").getText();
                        assertTrue(BannerSitterPass.contains("You saved $20 with Sitter Pass"));//проверка отображения баннера
                        Thread.sleep(1000);
                        MobileElement CompletePayment = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name='Complete Payment'])[6]");
                        CompletePayment.click();
                        Thread.sleep(1000);
                        String RequiredSafety = driver.findElementByXPath("//XCUIElementTypeOther[@name='Required Safety Protocols']").getText();
                        assertTrue(RequiredSafety.contains("Required Safety Protocols"));//проверка отображения протокола
                        Thread.sleep(1000);
                        driver.findElementByXPath("((//XCUIElementTypeOther[@name='Agree'])[1]").click();
                        Thread.sleep(5000);
                        String HomePage = driver.findElementByAccessibilityId("Upcoming").getText();
                        System.out.println(HomePage);
//                        assertTrue(RequiredSafety.contains("Required Safety Protocols"));//проверка отображения протокола.
                        driver.quit();
                } catch (Exception exception) {
                        {
                                System.out.println(exception);
                                driver.quit();

                        }
                }
        }
}
