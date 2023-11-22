package listeners;

import annotations.FrameworkAnnotaions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import report.ExtentLogger;
import report.ExtentReport;

import java.util.Arrays;

public class Listeners implements ITestListener
{
    @Override
    public void onStart(ITestContext context)
    {
        ExtentReport.initReports();
    }

    @Override
    public void onFinish(ITestContext context)
    {
        ExtentReport.flushReports();
    }

    @Override
    public void onTestStart(ITestResult result)
    {
        ExtentReport.createTest(result.getName());
        ExtentReport.assignAuthor(result.getMethod().getConstructorOrMethod().getMethod()
                .getAnnotation(FrameworkAnnotaions.class).Author());
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        ExtentLogger.pass(result.getName() + " is passed");

    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        ExtentLogger.fail(result.getName()+ " is failed");
        ExtentLogger.fail(result.getThrowable().getMessage());
        ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
    }
}
