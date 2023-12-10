package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage1 extends Utility {
    By adminButtonOption = (By.xpath("//span[normalize-space()='Admin']"));

    public void adminButtonOption() {
        clickOnElement(adminButtonOption);
    }

    By verifySystemUsersText = (By.xpath("//h5[normalize-space()='System Users']"));

    public String verifySystemUsersText() {
        return getTextFromElement(verifySystemUsersText);
    }

    By enterUsername1 = (By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));

    public void enterUsername1(String username1) {
        sendTextToElement(enterUsername1, username1); //Cheeku
    }

    By mouseHoverOnUserRole = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");

    public void mouseHoverOnUserRole() {
        mouseHoverToElementAndClick(mouseHoverOnUserRole);
    }

    By selectUserRoleAsAdmin = (By.xpath("//div[@class='oxd-select-text-input'][normalize-space()='Admin']"));

    public void selectUserRoleAsAdmin() {
        mouseHoverToElementAndClick(selectUserRoleAsAdmin);//Admin
    }

    By enterEmployeeName1  = (By.xpath("//input[@placeholder='Type for hints...']")); //Lisa Andrews
    public void enterEmployeeName(String employeeName){
        sendTextToElement(enterEmployeeName1, employeeName);
    }

    By dropDownSelectStatus = (By.xpath("//div[4]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]"));
    public void dropDownSelect() {
        mouseHoverToElementAndClick(dropDownSelectStatus);
    }

    By selectEnabledStatus = (By.xpath("//div[@class='oxd-select-text-input'][normalize-space()='Enabled']"));
    public void selectEnabledStatus(){
        mouseHoverToElementAndClick(selectEnabledStatus);
    }
    By clickOnUsernameCheckbox = (By.xpath("//div[@role='columnheader']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
    public void clickOnUsernameCheckbox() {
        clickOnElement(clickOnUsernameCheckbox);
    }

    By clickOnDeleteButton =(By.xpath("//i[@class='oxd-icon bi-trash']"));
    public void clickOnDeleteButton() {
        clickOnElement(clickOnDeleteButton);
    }

    By clickYesDeleteButton = (By.xpath("//button[normalize-space()='Yes, Delete']"));
      public void clickYesDeleteButton(){
          clickOnElement(clickYesDeleteButton);
      }
}
