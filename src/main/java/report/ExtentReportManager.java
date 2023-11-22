package report;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentReportManager
{
    private ExtentReportManager() {};

    private static final ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<>();

    public static ExtentTest getExtentTest()
    {
        return threadLocal.get();
    }

    static void setExtentTest(ExtentTest test)
    {
        threadLocal.set(test);
    }
}
