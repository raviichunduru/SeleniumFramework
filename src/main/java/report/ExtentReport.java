package report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import constants.FrameWorkConstants;

public final class ExtentReport
{
    private ExtentReport(){};

    private static ExtentReports extent;
    private static ExtentTest extentTest;

    public static void initReports()
    {
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(FrameWorkConstants.getReportPath());
        extent.attachReporter(spark);
    }

    public static void flushReports()
    {
        extent.flush();
    }

    public static void createTest(String testcaseName)
    {
        extentTest =extent.createTest(testcaseName);
        ExtentReportManager.setExtentTest(extentTest);
    }

    public static void assignAuthor(String author)
    {
        ExtentReportManager.getExtentTest().assignAuthor(author);
    }

}
