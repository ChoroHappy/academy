package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Dashboard_page {

    public Dashboard_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@id='mySidenav'])//a[2]")
    public WebElement dashboardButton;

    @FindBy(xpath = "(//ul[@id='user-options']//li//a)[1]")
    public WebElement myDashboardButton;
    @FindBy(xpath = "//*[@id=\"user-options\"]/li[2]")
    public WebElement myProfileButton;
    @FindBy(xpath = "(//ul[@id='user-options']//li)[3]")
    public WebElement settingsButton;


}
