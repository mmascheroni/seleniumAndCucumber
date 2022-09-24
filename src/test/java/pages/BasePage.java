package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    // wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    private static Actions action;

    static {
        // System.setProperty("webdriver.chrome.driver", "C:/Program
        // Files/ChromeDriver/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void enterCriteria(String locator, String criteria) {
        Find(locator).clear();
        Find(locator).sendKeys(criteria);
    }

    public void clickButton(String locator) {
        Find(locator).click();
    }

    public void selectFromDropdownByValue(String locator, String valueToSelect) {
        Select dropdown = new Select(Find(locator));

        dropdown.selectByValue(valueToSelect);
    }

    public void selectFromDropdownByIndex(String locator, int valueToSelect) {
        Select dropdown = new Select(Find(locator));

        dropdown.selectByIndex(valueToSelect);
    }

    public void hoverOverElement(String locator) {
        action.moveToElement(Find(locator));
    }

    public void doubleClick(String locator) {
        action.doubleClick(Find(locator));
    }

    public void rightClick(String locator) {
        action.contextClick(Find(locator));
    }

    public String getValueFromTable(String locator, int row, int column) {
        String cellINeed = locator + "/table/tbody/tr[" + row + "]/td[" + column + "]";

        return Find(cellINeed).getText();
    }

    public void setValueOnTable(String locator, int row, int column, String stringToSend) {
        String cellToFill = locator + "/table/tbody/tr[" + row + "]/td[" + column + "]";

        Find(cellToFill).sendKeys(stringToSend);
    }

}
