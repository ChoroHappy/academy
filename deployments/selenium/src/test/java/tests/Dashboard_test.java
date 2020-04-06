package tests;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import pages.Dashboard_page;
import pages.Home_page;
import pages.Login_page;
import utilities.Config;
import utilities.Driver;
import utilities.SeleniumUtils;

public class Dashboard_test {

    Home_page home_page = new Home_page();
    Login_page login_page = new Login_page();
    Dashboard_page dashboard_page = new Dashboard_page();
    WebElement username;

    @Test
    public void setUp() {
        Driver.getDriver().get(Config.getProperty("academyURL"));

        login_page.loginButton.click();
        username = login_page.usernameInputBox;
        username.sendKeys(Config.getProperty("username"));
        login_page.passwordInputBox.sendKeys(Config.getProperty("password"));
        login_page.loginButton2.click();
    }

    @Test
    public void dashBoardTest() throws Exception {
        Thread.sleep(2000);
        home_page.menuButton.click();
        Thread.sleep(2000);
        dashboard_page.dashboardButton.click();
        dashboard_page.myDashboardButton.click();
        dashboard_page.pynoteButton.click();
        dashboard_page.jenkinsButton.click();
        Thread.sleep(2000);
        dashboard_page.usersButton.click();
        for (int i = 0; i < dashboard_page.users.size(); i++) {

            Thread.sleep(2000);

            if (dashboard_page.users.get(i).equals("Fred")){
                return;
            }

        }
    }
}
