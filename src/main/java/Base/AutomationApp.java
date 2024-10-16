package Base;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AutomationApp {
    private static AndroidDriver driver;


    public static void main(String[] args) {
        // Set up desired capabilities and connect to Appium server
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554"); // Your device name
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15"); // Your device version
        caps.setCapability("appium:ensureWebviewsHavePages", true);
        caps.setCapability("appium:nativeWebScreenshot", true);
        caps.setCapability("appium:newCommandTimeout", 3600);
        caps.setCapability("appium:connectHardwareKeyboard", true);
        caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\DELL\\IdeaProjects\\SFA\\src\\main\\resources\\ApiDemos-debug.apk"); // Path to the app


        try {
            //Connection
             driver = new AndroidDriver (new URL(" http://127.0.0.1:4723/"), caps);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Step 1 : press the yes/no button
            pressYesNoButton();


            //Step 2:change the date
            changeDate();

            //step 3 navigate back to home page
            navigateBackToHomePage();


            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.quit();

        } catch (Exception e) {
             e.printStackTrace();
        }
    }

    private static void pressYesNoButton() {
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Buttons\"]")).click();
        driver.findElement(By.xpath("//android.widget.ToggleButton[@content-desc=\"Toggle\"]")).click();
    }

    private static void changeDate() {
        driver.navigate().back();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Date Widgets\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"2. Inline\"]")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Switch to text input mode for the time input.\"]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"android:id/input_hour\"]")).sendKeys("10");
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"android:id/input_minute\"]")).sendKeys("30");
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Switch to clock mode for the time input.\"]")).click();
    }

    private static void navigateBackToHomePage() {
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
