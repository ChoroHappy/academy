package tests;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Login_page;
import pages.PyNote_page;
import utilities.Config;
import utilities.Driver;

public class Pynote_test {

    Login_page login_page = new Login_page();
    PyNote_page pyNote_page = new PyNote_page();
    WebDriverWait webDriverWait;


    @Test
    public void setUp() {
        Driver.getDriver().get(Config.getProperty("academyURL"));
        login_page.loginButton.click();
        login_page.usernameInputBox.sendKeys(Config.getProperty("username"));
        login_page.passwordInputBox.sendKeys(Config.getProperty("password"));
        login_page.loginButton2.click();
    }

    @Test
    public void pynoteTest() throws InterruptedException {
        webDriverWait = new WebDriverWait(Driver.getDriver(), 10);
        Thread.sleep(1000);
        pyNote_page.pyNoteButton.click();
        Thread.sleep(2000);


        if (!pyNote_page.nameOfCreatedPynote.getText().equalsIgnoreCase("username")) {
            pyNote_page.createPyNoteButton.click();
            webDriverWait.until(ExpectedConditions.visibilityOf(pyNote_page.serverNameInputBox));
            pyNote_page.serverNameInputBox.sendKeys(Config.getProperty("username"));
            pyNote_page.passwordInputBox.sendKeys(Config.getProperty("password"));
            Thread.sleep(1000);
            pyNote_page.createPyNotePlatformButton.click();
        } else {
            pyNote_page.linkOfPynote.click();
            Thread.sleep(1000);
            pyNote_page.passwordTokenInputBox.sendKeys(Config.getProperty("password"));
            pyNote_page.loginButton.click();
            Thread.sleep(1000);
            pyNote_page.newButton.click();
            pyNote_page.python3Button.click();
            Thread.sleep(1000);
            pyNote_page.loginButton.click();


        }
    }
}
