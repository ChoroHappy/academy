package tests;

import com.github.javafaker.Faker;
import org.apache.xmlbeans.impl.xb.xsdschema.Facet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ContactUs_page;
import pages.Home_page;
import pages.Login_page;
import utilities.Config;
import utilities.Driver;

public class ContactUs_test {

    ContactUs_page contactUs_page = new ContactUs_page();
    Login_page login_page = new Login_page();
    Home_page home_page = new Home_page();
    Faker faker = new Faker();
   // WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), 10);


//        webDriverWait.until(ExpectedConditions.visibilityOf(dynamicLoading1Page.usernameInput));
//
//        dynamicLoading1Page.usernameInput.sendKeys("tomsmith");

    @Test
    public void setUp() {
        Driver.getDriver().get(Config.getProperty("academyURL"));

        login_page.loginButton.click();
        login_page.usernameInputBox.sendKeys("username");
        login_page.passwordInputBox.sendKeys("Admin12345671");
        login_page.loginButton2.click();
    }

    @Test
    public void contactUsTest() throws InterruptedException {
         Thread.sleep(2000);

        WebElement menu = home_page.menuButton;
       // webDriverWait.until(ExpectedConditions.visibilityOf(menu));
        menu.click();

        Thread.sleep(2000);
        WebElement contactUs = contactUs_page.contactUsButton;
        // webDriverWait.until(ExpectedConditions.elementToBeClickable(contactUs));
        contactUs.click();

        WebElement dropdowns = contactUs_page.aboutDropdown;
        dropdowns.click();
        Select select = new Select(dropdowns);
        select.selectByVisibleText("Python");

        contactUs_page.firstNameInputBox.sendKeys(faker.name().firstName());
        contactUs_page.lastNameInputBox.sendKeys(faker.name().lastName());
        contactUs_page.phoneNumberInputBox.sendKeys(faker.phoneNumber().cellPhone());
        contactUs_page.questionInputBox.sendKeys("What is python?");
        contactUs_page.submitButton.click();
        Assert.assertEquals("Your QUESTION is submited", contactUs_page.verificationText.getText(), "Your QUESTION is submited");
    }
}
