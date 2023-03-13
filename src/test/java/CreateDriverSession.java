import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSession {
    public static AppiumDriver AndroidDriver()throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Samsung A52");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID,"RR8R602TX1M");
//        caps.setCapability("avd","Pixel_6"); Untuk Running pakai emulator
//        caps.setCapability("avdLaunchTimeout",180000); Untuk Running pakai emulator
//        caps.setCapability("appPackage","io.appium.android.apis"); ini untuk appPackage biar bisa langsung buka app(adb shell dumpsys window | grep -E mCurrentFocus)
//        caps.setCapability("appActivity","io.appium.android.apis.ApiDemos"); ini untuk biar bisa langsung ngebuka yg lagi jalan di app
        caps.setCapability(MobileCapabilityType.APP,"/home/puffywoof/Downloads/ApiDemos-debug.apk");

        URL url = new URL("http://0.0.0.0:4723");

        AppiumDriver driver = new AndroidDriver(url, caps);
            return driver;
    }
}
