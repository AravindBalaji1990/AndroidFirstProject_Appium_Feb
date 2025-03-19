package testpackappiumiosdemo;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URL;

public class IosRunDemo_ExistingApp_IosSpecific {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        XCUITestOptions object_XCUITestOptions = new XCUITestOptions();
        object_XCUITestOptions.setPlatformName("IOS");
        object_XCUITestOptions.setAutomationName(AutomationName.IOS_XCUI_TEST);

        object_XCUITestOptions.setBundleId("com.moataz.dailycheck");

        object_XCUITestOptions.setUdid("08BBF8F2-37A6-42E0-AB9F-65C5E6AEC31B");


        IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/"), object_XCUITestOptions);
        Thread.sleep(3000);

        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"plus.circle\"`]")).click();
        Thread.sleep(3000);


        System.out.println(driver.findElement(AppiumBy.iOSNsPredicateString("name == \"Scheduled\"")).isDisplayed());
        driver.quit();

    }
}
