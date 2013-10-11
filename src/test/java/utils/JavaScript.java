package utils;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class JavaScript {

    public static void closeJSPopup(WebDriver driver, Alert alert) {
        /**
         * Method to close a JS pop-ups
         */
        alert = driver.switchTo().alert();
        alert.accept();
    }
}
