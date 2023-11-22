package pages.pagecomponent;

import enums.WaitStrategy;
import org.openqa.selenium.By;
import static utils.SeleniumUtils.*;

public class LeftMenuComponents
{
    private static final By LNK_ADMIN = By.xpath("//ul[@class='oxd-main-menu']/li[1]");

    public void clickAdminLink()
    {
        click(LNK_ADMIN, WaitStrategy.PRESENCE,"Admin link");
    }

}
