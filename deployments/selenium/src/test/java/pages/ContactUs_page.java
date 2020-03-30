package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUs_page {
    public ContactUs_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@id='mySidenav']//a)[5]")
    public WebElement contactUsButton;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement aboutDropdown;

    @FindBy(name = "firstname")
    public WebElement firstNameInputBox;

    @FindBy(name = "lastname")
    public WebElement lastNameInputBox;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneNumberInputBox;
    @FindBy(xpath = "//textarea[@id='question']")
    public WebElement questionInputBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "/html/body/h1")
    public WebElement verificationText;

}
