package utils;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class JavaScript {

    public static void closeJSPopup(WebDriver driver, Alert alert) {
        alert = driver.switchTo().alert();
        alert.accept();
    }
}
