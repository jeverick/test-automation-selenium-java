package utils.WebElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Inputs {

    public static void clickButton(WebDriver driver, String identifyBy, String locator) {
        if (identifyBy.equalsIgnoreCase("xpath")) {
            driver.findElement(By.xpath(locator)).click();

        } else if (identifyBy.equalsIgnoreCase("id")) {
            driver.findElement(By.id(locator)).click();

        } else if (identifyBy.equalsIgnoreCase("name")) {
            driver.findElement(By.name(locator)).click();
        }
    }

    public static void typeinEditbox(WebDriver driver, String identifyBy, String locator, String valuetoType) {
        if (identifyBy.equalsIgnoreCase("xpath")) {
            driver.findElement(By.xpath(locator)).sendKeys(valuetoType);

        } else if (identifyBy.equalsIgnoreCase("id")) {
            driver.findElement(By.id(locator)).sendKeys(valuetoType);

        } else if (identifyBy.equalsIgnoreCase("name")) {
            driver.findElement(By.name(locator)).sendKeys(valuetoType);
        }
    }

    public static void selectRadiobutton(WebDriver driver, String identifyBy, String locator) {
        if (identifyBy.equalsIgnoreCase("xpath")) {
            driver.findElement(By.xpath(locator)).click();

        } else if (identifyBy.equalsIgnoreCase("id")) {
            driver.findElement(By.id(locator)).click();

        } else if (identifyBy.equalsIgnoreCase("name")) {
            driver.findElement(By.name(locator)).click();
        }
    }

    public static void selectCheckbox(WebDriver driver, String identifyBy, String locator, String checkFlag) {
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
        List<WebElement> options = driver.findElements(By.tagName("option"));
        for (WebElement option : options) {
            if (valToBeSelected.equalsIgnoreCase(option.getText())) {
                option.click();
            }
        }
    }
}
