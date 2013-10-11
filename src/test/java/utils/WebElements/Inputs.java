package utils.WebElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Inputs {

    public static void clickButton(WebDriver driver, String identifyBy, String locator) {
        /**
         * Method to select a button
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
        }
    }

    public static void typeinEditbox(WebDriver driver, String identifyBy, String locator, String valuetoType) {
        /**
         * Method to enter text into a text input field
         *
         * Accepts:
         *   - driver: the current test's WebDriver
         *   - identityBy: the type of locator to use (ie: xpath, id, etc...)
         *   - locator: the actual location value used by the identityBy attribute
         *   - valuetoType: the value to enter into the input
         */
        if (identifyBy.equalsIgnoreCase("xpath")) {
            driver.findElement(By.xpath(locator)).sendKeys(valuetoType);

        } else if (identifyBy.equalsIgnoreCase("id")) {
            driver.findElement(By.id(locator)).sendKeys(valuetoType);

        } else if (identifyBy.equalsIgnoreCase("name")) {
            driver.findElement(By.name(locator)).sendKeys(valuetoType);
        }
    }

    public static void selectRadiobutton(WebDriver driver, String identifyBy, String locator) {
        /**
         * Method to check a radio button
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
        }
    }

    public static void selectCheckbox(WebDriver driver, String identifyBy, String locator, String checkFlag) {
        /**
         * Method to check checkbox values
         *
         * Accepts:
         *   - driver: the current test's WebDriver
         *   - identityBy: the type of locator to use (ie: xpath, id, etc...)
         *   - locator: the actual location value used by the identityBy attribute
         *   - checkFlag: value to say whether to keep the checkbox selected or not
         *     accepted values are "ON" to keep it checked and anything else to
         *     un-check it
         */
        if (identifyBy.equalsIgnoreCase("xpath")) {
            if ((checkFlag).equalsIgnoreCase("ON")) {
                if (!(driver.findElement(By.xpath(locator)).isSelected())) {
                    driver.findElement(By.xpath(locator)).click();
                }
            }
        } else if (identifyBy.equalsIgnoreCase("id")) {
            if ((checkFlag).equalsIgnoreCase("ON")) {
                if (!(driver.findElement(By.id(locator)).isSelected())) {
                    driver.findElement(By.id(locator)).click();
                }
            }
        } else if (identifyBy.equalsIgnoreCase("name")) {
            if ((checkFlag).equalsIgnoreCase("ON")) {
                if (!(driver.findElement(By.name(locator)).isSelected())) {
                    driver.findElement(By.name(locator)).click();
                }
            }
        }
    }

    public static void selectValue(WebDriver driver, String valToBeSelected) {
        /**
         * Method to select a value for a select box
         *
         * Accepts:
         *   - driver: the current test's WebDriver
         *   - valToBeSelected: value to set a select box to
         */

        // TODO: Verify that this works as expected (what happens when there are multiple selects on a page).
        List<WebElement> options = driver.findElements(By.tagName("option"));
        for (WebElement option : options) {
            if (valToBeSelected.equalsIgnoreCase(option.getText())) {
                option.click();
            }
        }
    }
}
