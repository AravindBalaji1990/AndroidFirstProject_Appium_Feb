package testpackappiumrundemo;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class AndroidLocatorDemo {

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

        //locator - accessibility id
//        driver.findElement(AppiumBy.accessibilityId("Animation")).click();

//        locator using resource id = id
        // whenever ther eis duplciate it will pick the first occurence of the lement with the locator and perform the action
        // if there is nothing avialable - exception
        driver.findElement(AppiumBy.id("android:id/text1")).click();



        // to identify all thelement or duplicates

        List<WebElement> totaltext1 = driver.findElements(AppiumBy.id("android:id/text1"));
        System.out.println("total items avaialble : " + totaltext1.size());

        for(int i =0 ;i < totaltext1.size() ;i++){

            if(totaltext1.get(i).getText().equalsIgnoreCase("Graphics")) {
                System.out.println("get the text value of the element : " + totaltext1.get(i).getText());
                System.out.println("get the attribute value of the element : " + totaltext1.get(i).getAttribute("content-desc"));
                totaltext1.get(i).click();
            }
        }


//        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Access'ibility\"]")).click();

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"][3]")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}
