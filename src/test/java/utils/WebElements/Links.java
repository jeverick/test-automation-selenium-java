package utils.WebElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Links {

    public static void clickLink(WebDriver driver, String identifyBy, String locator) {
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
