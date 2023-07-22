package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static hooks.DriverForAndroid.androidDriver;

public class LoginPage extends BasePage {

    private final By loginField = By.id("com.alfabank.qapp:id/etUsername");
    private final By passwordField = By.cssSelector("#com.alfabank.qapp:id/etPassword");
    private final By loginButton = By.xpath("//*[text() = 'Вход']");
    private final By errorMessage = By.id("com.alfabank.qapp:id/tvError");
    public void enterCredentials(String login, String password){
        sendCase(login, (WebElement) loginField);
        sendCase(password, (WebElement) passwordField);
    }

    public void enterToProfile() {
        clickToElement((WebElement) loginButton);
    }

    public boolean displayErrorMessage() {
        return androidDriver.findElement(errorMessage).isDisplayed();
    }
}
