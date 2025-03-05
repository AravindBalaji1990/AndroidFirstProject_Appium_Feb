package testpackappiumrundemo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidRunDemo {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        //this is configuration only for Android
        UiAutomator2Options obj_andorid = new UiAutomator2Options();
        obj_andorid.setPlatformName("Android");
        obj_andorid.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        obj_andorid.setUdid("29221JEGR00379");
        obj_andorid.setApp(System.getProperty("user.dir")+"\\src\\test\\resources\\sampleapp\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),obj_andorid);

        Thread.sleep(3000);

        driver.quit();
    }
}
