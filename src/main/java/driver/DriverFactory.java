package driver;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public final class DriverFactory
{
    private DriverFactory() {};

    public static WebDriver getDriver(String browser, String runmode) throws MalformedURLException
    {
        WebDriver driver = null;

        if(runmode.equalsIgnoreCase("local"))
        {
            driver = LocalDriverFactory.localDriverFactory(browser);
        }

        else if (runmode.equalsIgnoreCase("remote"))
        {
            driver = RemoteDriverFactory.remoteDriverFactory(browser);
        }

        return driver;
    }
}
