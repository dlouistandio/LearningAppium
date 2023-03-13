import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class AndroidUIAutomator {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.AndroidDriver();

        WebElement myElement = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Animation\")"));
        System.out.println(myElement.getText());
//        By myElement1 = AppiumBy.androidUIAutomator("");

        myElement = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.TextView\")")).get(3);
        System.out.println(myElement.getText());

        myElement = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\n\")")).get(2);
        System.out.println(myElement.getText());

    }



}
