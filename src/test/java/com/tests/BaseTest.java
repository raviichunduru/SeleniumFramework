package com.tests;

import driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class BaseTest
{

    @BeforeMethod
    public void setUp( ) throws MalformedURLException {
        Driver.initDriver();
    }

    @AfterMethod
    public void tearDown()
    {
        Driver.quitDriver();
    }

}
