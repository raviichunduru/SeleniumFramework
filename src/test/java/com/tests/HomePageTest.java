package com.tests;

import annotations.FrameworkAnnotaions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import testdata.TestData;
import utils.DataProviderUtils;

public class HomePageTest extends BaseTest
{
    @FrameworkAnnotaions
    @Test(description = "To validate OrangeCRM home page title",dataProvider = "getData", dataProviderClass = DataProviderUtils.class)
    public void titleValidation(TestData testData) throws InterruptedException
    {
        LoginPage loginpage = new pages.LoginPage();
        String actualTitle = loginpage.loginToApplication(testData.userID, testData.password)
                             .getHomePageTitle();
        Assert.assertEquals(actualTitle,testData.expectedTitle);
    }
}