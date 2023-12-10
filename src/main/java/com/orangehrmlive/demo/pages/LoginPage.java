package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    //1.LoginPage - Store username, password, Login Button, HR for All logo, and LOGIN Panel text Locators
    //  and create appropriate methods for it.
    By enterUsername = (By.name("username"));

    public void enterUsername(String username) {
        sendTextToElement(enterUsername, username);
    }

    By enterPassword = (By.name("password"));

    public void enterPassword(String password) {
        sendTextToElement(enterPassword, password);

    }

    By clickOnLoginButton = (By.xpath("//button[@type='submit']"));

    public void clickOnLoginButton() {
        clickOnElement(clickOnLoginButton);
    }

    By verifyhrForAllLogo = (By.cssSelector(".orangehrm-login-logo"));

    public String verifyhrForAllLogo() {
        return getTextFromElement(verifyhrForAllLogo);
    }

    By verifyLoginTextAtTheTopHeader = (By.xpath("//h5[normalize-space()='Login']"));

    public String verifyLoginTextAtTheTopHeader() {
        return getTextFromElement(verifyLoginTextAtTheTopHeader);
    }

    By forgotYourPasswordLink = (By.cssSelector(".oxd-text.oxd-text--p.orangehrm-login-forgot-header"));

    public void forgotYourPasswordLink() {
        clickOnElement(forgotYourPasswordLink);
    }

    By orangeHrmIncLinkAtTheFooter = (By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));

    public void orangeHrmIncLinkAtTheFooter() {
        clickOnElement(orangeHrmIncLinkAtTheFooter);
    }

    By linkedInLogo = (By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']"));

    public void linkedInLogo() {
        clickOnElement(linkedInLogo);
    }

    By facebookLogo = (By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']"));

    public void facebookLogo() {
        clickOnElement(facebookLogo);
    }
   By twitterLogo = (By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']//*[name()='svg']"));
    public void twitterLogo() {
        clickOnElement(twitterLogo);
    }
    By youtubeLogo = (By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']//*[name()='svg']"));
    public void youtubeLogo() {
        clickOnElement(youtubeLogo);
    }
}
