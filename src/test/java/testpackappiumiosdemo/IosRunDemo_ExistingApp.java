package testpackappiumiosdemo;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URL;

public class IosRunDemo_ExistingApp {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        XCUITestOptions object_XCUITestOptions = new XCUITestOptions();
        object_XCUITestOptions.setPlatformName("IOS");
        object_XCUITestOptions.setAutomationName(AutomationName.IOS_XCUI_TEST);

        object_XCUITestOptions.setBundleId("com.xe.XECurrency");
        object_XCUITestOptions.setBundleId("test.test32432");

        object_XCUITestOptions.setUdid("00008110-0012088A2210401E");

        IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/"), object_XCUITestOptions);
        Thread.sleep(3000);

        driver.quit();

    }
}
