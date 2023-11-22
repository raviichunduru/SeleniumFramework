package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;
import static utils.SeleniumUtils.click;
import static utils.SeleniumUtils.sendKeys;

public class LoginPage
{
    private static final By TXTBOX_USER_NAME = By.xpath("//input[@name='username']");
    private static final By TXTBOX_PASSWORD = By.name("password");
    private static final By BTN_LOGIN = By.xpath("//button[@type='submit']");

    private LoginPage setUserName(String username)
    {
        sendKeys(TXTBOX_USER_NAME,username,"User name");
        return this;
    }

    private LoginPage setPassword(String password)
    {
        sendKeys(TXTBOX_PASSWORD, password,"Password");
        return this;
    }

    private HomePage clickLogin()
    {
        click(BTN_LOGIN, WaitStrategy.PRESENCE, "Login Button");
        return new HomePage();  // page chaining
    }

    public HomePage loginToApplication(String username, String password) //method chaining
    {
        return setUserName(username)
                .setPassword(password)
                .clickLogin();
    }
}