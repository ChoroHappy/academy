package tests;

import org.junit.Test;
import pages.Dashboard_page;
import pages.Home_page;
import pages.Login_page;
import utilities.Config;
import utilities.Driver;

public class Dashboard_test {

    Home_page home_page = new Home_page();
    Login_page login_page = new Login_page();
    Dashboard_page dashboard_page = new Dashboard_page();

    @Test
    public void setUp() {
        Driver.getDriver().get(Config.getProperty("academyURL"));

        login_page.loginButton.click();
        login_page.usernameInputBox.sendKeys("username");
        login_page.passwordInputBox.sendKeys("Admin12345671");
        login_page.loginButton2.click();
    }

    @Test
    public void dashBoardTest() throws Exception {
        Thread.sleep(2000);
        home_page.menuButton.click();
        Thread.sleep(2000);
        dashboard_page.dashboardButton.click();
        dashboard_page.myDashboardButton.click();
        dashboard_page.myProfileButton.click();
        Thread.sleep(2000);
        dashboard_page.settingsButton.click();




    }
}
