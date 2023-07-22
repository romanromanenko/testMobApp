package pages;

import static hooks.DriverForAndroid.androidDriver;
import org.openqa.selenium.By;

public class ProfilePage extends BasePage{

    private final By titleOfMainPage = By.className("android.widget.TextView");
    public boolean checkForMainPage() {
        return androidDriver.findElement(titleOfMainPage).isDisplayed();
    }
}
