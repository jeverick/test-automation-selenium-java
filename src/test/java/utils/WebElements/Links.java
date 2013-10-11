package utils.WebElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Links {

    public static void clickLink(WebDriver driver, String identifyBy, String locator) {
        /**
         * Method to select a link
         *
         * Accepts:
         *   - driver: the current test's WebDriver
         *   - identityBy: the type of locator to use (ie: xpath, id, etc...)
         *   - locator: the actual location value used by the identityBy attribute
         */
        if (identifyBy.equalsIgnoreCase("xpath")) {
            driver.findElement(By.xpath(locator)).click();

        } else if (identifyBy.equalsIgnoreCase("id")) {
            driver.findElement(By.id(locator)).click();

        } else if (identifyBy.equalsIgnoreCase("name")) {
            driver.findElement(By.name(locator)).click();

        } else if (identifyBy.equalsIgnoreCase("name")) {
            driver.findElement(By.linkText(locator)).click();

        } else if (identifyBy.equalsIgnoreCase("name")) {
            driver.findElement(By.partialLinkText(locator)).click();
        }
    }
}
