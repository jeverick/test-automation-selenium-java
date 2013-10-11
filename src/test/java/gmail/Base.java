package gmail;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static utils.WebElements.Inputs.*;

public class Base {

    public static WebDriver driver;

    @BeforeClass
    public static void setupBeforeClass() {

        driver = new FirefoxDriver();
        driver.get("http://gmail.com");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tareDownAfterClass() {
        driver.close();
    }

    public static void fillTextInput(WebDriver driver, String identifyBy, String locator, String valuetoType) {
        typeinEditbox(driver, identifyBy, locator, valuetoType);
    }

    public static void pressButton(WebDriver driver, String identifyBy, String locator) {
        clickButton(driver, identifyBy, locator);
    }
}
