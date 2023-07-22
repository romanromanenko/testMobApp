package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static hooks.DriverForAndroid.androidDriver;

public class BasePage {

    WebDriverWait wait = new WebDriverWait(androidDriver, Duration.ofSeconds(30));

    public void waitVisibilityOfElementLocatedByID(String ID){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ID)));
    }

    public void waitVisibilityOfElementLocatedByCSS(String cssSelector){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(cssSelector)));
    }

    public void sendCase(String value, WebElement element){
        androidDriver.findElement((By) element).sendKeys(value);
    }

    public void clickToElement(WebElement element){
        androidDriver.findElement((By) element).click();
    }
}
