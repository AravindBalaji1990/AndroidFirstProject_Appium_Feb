package testpackappiumiosdemo;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URL;

public class IosRunDemo_ExistingAPpp {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        XCUITestOptions object_XCUITestOptions = new XCUITestOptions();
        object_XCUITestOptions.setPlatformName("IOS");
        object_XCUITestOptions.setAutomationName(AutomationName.IOS_XCUI_TEST);

        object_XCUITestOptions.setBundleId("com.moataz.dailycheck");

        object_XCUITestOptions.setUdid("9C4CF5F8-F6CD-44FC-AC73-5B595592AD1B");
        object_XCUITestOptions.setDeviceName("iPhone 16 Plus");

        IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/"), object_XCUITestOptions);
        Thread.sleep(3000);


        driver.quit();

    }
}
