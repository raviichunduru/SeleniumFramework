package utils;

import config.ConfigFactory;
import driver.DriverManager;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import report.ExtentLogger;

import java.time.Duration;

public class SeleniumUtils
{
    public static void click(By by, WaitStrategy waitStrategy, String elementName)
    {
        WebElement element = null;
        if(waitStrategy == WaitStrategy.PRESENCE)
        {
            element = WaitUntilElementPresent(by);
        }
        else if (waitStrategy == WaitStrategy.CLICKABLE)
        {
            element = WaitUntilElementClickable(by);
        }
        else if (waitStrategy == WaitStrategy.VISIBLE)
        {
            element = WaitUntilElementVisible(by);
        }
        element.click();
        ExtentLogger.info(elementName + " is clicked");
    }

    public static void sendKeys(By by, String value, String elementName)
    {
        WaitUntilElementPresent(by).sendKeys(value);
        ExtentLogger.pass(value + " is entered into " +elementName);

    }

    private static WebElement WaitUntilElementPresent(By by)
    {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    private static WebElement WaitUntilElementClickable(By by)
    {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    private static WebElement WaitUntilElementVisible(By by)
    {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
