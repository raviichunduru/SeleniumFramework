package driver;

import config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final class RemoteDriverFactory
{
    private RemoteDriverFactory() {};

    public static WebDriver remoteDriverFactory(String browser) throws MalformedURLException
    {
        WebDriver driver = null;
        DesiredCapabilities capabilities = new DesiredCapabilities();

        if(browser.equalsIgnoreCase("chrome"))
        {
            capabilities.setBrowserName("chrome");
        }
        else if (browser.equalsIgnoreCase("edge"))
        {
            capabilities.setBrowserName("edge");
        }
        else
        {
            capabilities.setBrowserName("firefox");
        }

        return new RemoteWebDriver(new URL(ConfigFactory.getConfig().remoteurl()), capabilities);
    }
}
