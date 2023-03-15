import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class AndroidGestures {
    public static void main(String[] args) throws Exception{
        AppiumDriver driver = CreateDriverSession.AndroidDriver();
        longClickGestures(driver);
    }

    public static void longClickGestures(AppiumDriver driver){
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag anf Drop")).click();
        WebElement element = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
        driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
//                "elementId", ((RemoteWebElement)element).getId(),
                "x", 217,
                "y",659,
                "duration", 1200
        ));
    }

    public static void clickGestures(AppiumDriver driver){
        WebElement element = driver.findElement(AppiumBy.id("Views"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement)element).getId()
        ));
    }

    public static void dragAndDropGestures(AppiumDriver driver){
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag anf Drop")).click();
        WebElement element = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

        driver.executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "endX",649,
                "endY", 662
        ));
    }

    public static void pinchGestures(AppiumDriver driver) throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(AppiumBy.xpath(""));
        Thread.sleep(5000);

        driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
                "left", 200, //x cordinates
                "top", 470, // y cordinates
                "width",600, // x to right - left
                "height",600, // y to bottom - top
                "percent", 0.75
        ));
    }
}
