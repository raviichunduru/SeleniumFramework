package report;

import com.aventstack.extentreports.MediaEntityBuilder;
import utils.ScreenShotUtils;

public final class ExtentLogger
{
    private ExtentLogger() {};

    public static void pass (String message)
    {
        ExtentReportManager.getExtentTest().pass(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtils.getScreenShot()).build());
    }

    public static void fail (String message)
    {
        ExtentReportManager.getExtentTest().fail(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtils.getScreenShot()).build());
    }

    public static void info (String message)
    {
        ExtentReportManager.getExtentTest().info(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtils.getScreenShot()).build());
    }
}
