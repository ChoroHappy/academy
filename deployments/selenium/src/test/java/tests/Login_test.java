package tests;

import org.junit.Test;
import pages.Login_page;
import utilities.Config;
import utilities.Driver;

public class Login_test {

    Login_page login_page = new Login_page();

    @Test
    public void setUp() {
        Driver.getDriver().get(Config.getProperty("academyURL"));

        login_page.loginButton.click();
        login_page.usernameInputBox.sendKeys(Config.getProperty("username"));
        login_page.passwordInputBox.sendKeys(Config.getProperty("password"));
        login_page.loginButton2.click();
    }
}
