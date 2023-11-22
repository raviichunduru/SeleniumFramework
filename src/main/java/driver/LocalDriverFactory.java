package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class LocalDriverFactory
{
    private LocalDriverFactory(){};

    public static WebDriver localDriverFactory(String browser)
    {
        WebDriver driver = null;

        if(browser.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        else
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }
}