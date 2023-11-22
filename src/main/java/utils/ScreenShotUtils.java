package utils;

import driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotUtils
{
    private ScreenShotUtils() {};

    public static String getScreenShot()
     {
         return ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
     }

}
