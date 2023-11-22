package com.tests;

import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.testng.annotations.Test;
import testdata.TestData;

public class DataSupplierTest
{
    @DataSupplier
    public StreamEx<TestData> getData()
    {
       return TestDataReader.use(XlsxReader.class)
                .withTarget(TestData.class)
                .withSource("testdata.xlsx")
                .read();
    }

    @Test(dataProvider = "getData")
    public void dataSupplierTest(TestData testData)
    {
        System.out.println(testData.userID);
        System.out.println(testData.password);

    }
}
