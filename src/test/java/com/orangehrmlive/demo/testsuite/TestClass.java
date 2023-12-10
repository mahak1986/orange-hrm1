package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {
    LoginPage loginPage = new LoginPage();
   HomePage homePage = new HomePage();
   DashboardPage dashboardPage = new DashboardPage();
    @Test
    public void successful() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        Thread.sleep(2000);
        homePage.searchField("Leave");
        Thread.sleep(2000);
        dashboardPage.userDropDownTab();
        Thread.sleep(2000);
        dashboardPage.infoAboutUser();
        Thread.sleep(2000);
        dashboardPage.crossAfterPopUpOnAbout();
        dashboardPage.stopWatchIcon();
        Thread.sleep(2000);

    }
}
