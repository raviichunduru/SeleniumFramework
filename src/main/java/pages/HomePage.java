package pages;

import driver.DriverManager;
import pages.pagecomponent.FooterMenuComponents;
import pages.pagecomponent.LeftMenuComponents;

public class HomePage
{
    private LeftMenuComponents leftMenuComponents;
    private FooterMenuComponents footerMenuComponents;

    public HomePage()
    {
        leftMenuComponents = new LeftMenuComponents();
        footerMenuComponents = new FooterMenuComponents();
    }

    public String getHomePageTitle()
    {
        return DriverManager.getDriver().getTitle();
    }

    public void clickAdminLink()
    {
        leftMenuComponents.clickAdminLink();
    }

    public void clickFooterLnk()
    {
        footerMenuComponents.clickFooterLink();
    }





}
