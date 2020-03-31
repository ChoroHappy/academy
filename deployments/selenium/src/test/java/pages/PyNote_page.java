package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class PyNote_page {
    public PyNote_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='topnav']//a)[3]")
    public WebElement pyNoteButton;

    @FindBy(xpath = "//button[@id='myBtn']")
    public WebElement createPyNoteButton;

    @FindBy(name = "server-name")
    public WebElement serverNameInputBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement createPyNotePlatformButton;

    @FindBy(xpath = "(//table//tr//td)[2]")
    public WebElement nameOfCreatedPynote;
    @FindBy(xpath = "(//table//tbody//tr/td/a)")
    public WebElement linkOfPynote;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement passwordTokenInputBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "(//span[@class='caret'])[1]")
    public WebElement newButton;

    @FindBy(xpath = "//li[@id='kernel-python3']//a")
    public WebElement python3Button;

    @FindBy(xpath = "//button[@id='logout']")
    public WebElement logoutButton;
}
