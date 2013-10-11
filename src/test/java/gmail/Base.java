package gmail;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Base {

    public static WebDriver driver;
    public Alert alert;

    @BeforeClass
    public static void setupBeforeClass() {

        driver = new FirefoxDriver();
        driver.get("http://gmail.com");
        driver.manage().window().maximize();
    }

    public static void closeJSPopup(WebDriver driver, Alert alert) {
        alert = driver.switchTo().alert();
        alert.accept();
    }

    public static void clickButton(WebDriver driver, String identifyBy, String locator) {
        if (identifyBy.equalsIgnoreCase("xpath")) {
            driver.findElement(By.xpath(locator)).click();

        } else if (identifyBy.equalsIgnoreCase("id")) {
            driver.findElement(By.id(locator)).click();

        } else if (identifyBy.equalsIgnoreCase("name")) {
            driver.findElement(By.name(locator)).click();
        }
    }

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

    @AfterClass
    public static void tareDownAfterClass() {
        driver.close();
    }
}
