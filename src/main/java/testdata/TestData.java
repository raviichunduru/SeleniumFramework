package testdata;

import io.github.sskorol.data.Column;

public class TestData
{
    @Column(name = "testcasename")
    public String testCaseName;

    @Column(name = "userid")
    public String userID;

    @Column(name = "password")
    public String password;

    @Column(name = "expectedtitle")
    public String expectedTitle;
}
