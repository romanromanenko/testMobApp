package hooks;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverForAndroid {

    public static AndroidDriver androidDriver;

    static {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "13.0");
        cap.setCapability("deviceName", "pixel_5");
        cap.setCapability("appPackage", "com.alfabank.qapp");
        cap.setCapability("appActivate", "com.alfabank.qapp.presentation.MainActivity");

        URL url = null;
        try {
            url = new URL("http://0.0.0.0:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        androidDriver = new AndroidDriver(url, cap);
        androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


}
