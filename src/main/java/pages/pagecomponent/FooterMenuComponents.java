package pages.pagecomponent;

import enums.WaitStrategy;
import org.openqa.selenium.By;
import static utils.SeleniumUtils.*;

public class FooterMenuComponents
{
    private static final By LNK_FOOTER = By.xpath("//a[text()='OrangeHRM, Inc']");

    public void clickFooterLink()
    {
        click(LNK_FOOTER, WaitStrategy.PRESENCE, "footer link");
    }

}
