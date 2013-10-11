package utils.WebElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Presence {

    public static boolean elementIsPresent(WebDriver driver, By location, int wait) {
        /**
         * Returns true if the the element specified at the location provided
         * can be found on the page within the wait time (in seconds).
         */
        try {
            WebElement e = (new WebDriverWait(driver, wait))
                    .until(ExpectedConditions.presenceOfElementLocated(location));
            return true;

        } catch (Exception e) {
            // do nothing
        }
        return false;
    }

}
