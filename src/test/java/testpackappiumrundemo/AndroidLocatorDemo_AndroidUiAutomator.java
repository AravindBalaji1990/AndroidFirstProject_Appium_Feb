package testpackappiumrundemo;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class AndroidLocatorDemo_AndroidUiAutomator {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        // install the app and open the app
        //this is configuration only for Android
        UiAutomator2Options obj_andorid = new UiAutomator2Options();
        obj_andorid.setPlatformName("Android");
        obj_andorid.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        obj_andorid.setUdid("29221JEGR00379");
        obj_andorid.setIgnoreHiddenApiPolicyError(true);
        obj_andorid.setAppPackage("io.appium.android.apis");
        obj_andorid.setAppActivity("io.appium.android.apis.ApiDemos");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), obj_andorid);

        // AndoridUIAutomator based locators

//        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"value\")"));
        List<WebElement> test = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")"));
        List<WebElement> test1 = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.TextView\")"));
        List<WebElement> test2 = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().description(\"Access'ibility\")"));
        List<WebElement> test3 = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().text(\"Access'ibility\")"));
//        List<WebElement> test4 = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/list\").childSelector(new UISelector.description(\"Access'ibility\"))"));
        System.out.println(test.size());
        System.out.println(test1.size());
        System.out.println(test2.size());
        System.out.println(test3.size());
//        System.out.println(test4.size());

        driver.quit();
    }
}
