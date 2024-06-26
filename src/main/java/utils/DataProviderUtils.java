package utils;

import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import testdata.TestData;

import java.lang.reflect.Method;

public class DataProviderUtils
{
    @DataSupplier(runInParallel = true)
    public StreamEx<TestData> getData(Method method)
    {
        return TestDataReader.use(XlsxReader.class)
                .withTarget(TestData.class)
                .withSource("testdata.xlsx")
                .read()
                .filter(testdata -> testdata.testCaseName.equalsIgnoreCase(method.getName()));
    }
}
