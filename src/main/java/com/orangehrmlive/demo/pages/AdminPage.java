package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {
    By adminButtonOption = (By.xpath("//span[normalize-space()='Admin']"));
    public void adminButtonOption() {
        clickOnElement(adminButtonOption);
    }

    By verifySystemUsersText = (By.xpath("//h5[normalize-space()='System Users']"));
    public String verifySystemUsersText(){
        return getTextFromElement(verifySystemUsersText);
    }

    By clickOnAddButton = (By.xpath("//button[normalize-space()='Add']"));
    public void clickOnAddButton() {
        clickOnElement(clickOnAddButton);
    }

    By verifyAddUserText = (By.xpath("//h6[normalize-space()='Add User']"));
     public String  verifyAddUserText(){
         return getTextFromElement(verifyAddUserText);
     }

    By mouseHoverOnUserRole =  By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    public void mouseHoverOnUserRole(){
        mouseHoverToElementAndClick(mouseHoverOnUserRole);
    }
    By userRoleAdmin = (By.xpath("//div[contains(text(),'Admin')]"));
    public void userRoleAdmin() {
        mouseHoverToElementAndClick(userRoleAdmin);
    }

    By userRoleEss = (By.xpath("//div[contains(text(),'ESS')]"));
    public void userRoleEss() {
        mouseHoverToElementAndClick(userRoleEss);
    }
    By enterEmployeeName  = (By.xpath("//input[@placeholder='Type for hints...']")); //Lisa Andrews
    public void enterEmployeeName(String employeeName){
        sendTextToElement(enterEmployeeName, employeeName);
    }

    By usernameTextField = (By.cssSelector("div[class='oxd-form-row'] div[class='oxd-grid-2 orangehrm-full-width-grid'] div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']"));
     public void usernameTextField(String username){
         sendTextToElement(usernameTextField, username);
     }

    By dropDownSelectStatus = (By.xpath("(//i)[12]"));
    public void dropDownSelectStatus() {
        mouseHoverToElementAndClick(dropDownSelectStatus);
    }

    By disabledOptionOnStatus = (By.xpath("//div[contains(text(),'Disabled')]"));
    public void disabledOptionOnStatus() {
        mouseHoverToElementAndClick(disabledOptionOnStatus);
    }

    By enterPassword = (By.xpath("(//input[@type='password'])[1]"));
    public void enterPassword(String password){
        sendTextToElement(enterPassword, password);
    }

    By enterConfirmPassword =(By.xpath("(//input[@type='password'])[2]"));
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(enterConfirmPassword, confirmPassword);
    }

    By clickOnSaveButton = (By.xpath("//button[normalize-space()='Save']"));
       public void clickOnSaveButton(){
           clickOnElement(clickOnSaveButton);
       }


    By enabledOptionOnStatus = (By.xpath("//div[@class='oxd-select-text-input'][normalize-space()='Enabled']"));

    public void enabledOptionOnStatus() {
        mouseHoverToElementAndClick(enabledOptionOnStatus);
    }

    By clickOnResetButton = (By.xpath("//button[normalize-space()='Reset']"));
     public void clickOnResetButton() {
         clickOnElement(clickOnResetButton);
     }
    By clickOnSearchButton = (By.xpath("//button[normalize-space()='Search']"));
    public void clickOnSearchButton() {
        clickOnElement(clickOnSearchButton);
    }

    By clickOnUsernameCheckbox = (By.xpath("//div[@role='columnheader']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
    public void clickOnUsernameCheckbox6o2jgdi195() {
        clickOnElement(clickOnUsernameCheckbox);
    }
    By deleteSelectedUser =(By.xpath("//button[normalize-space()='Delete Selected']"));
    public void deleteSelectedUser() {
        clickOnElement(deleteSelectedUser);
    }
    By clickOnEditPen = (By.xpath("(//i[@class='oxd-icon bi-pencil-fill'])[1]"));
    public void clickOnEditPen() {
        clickOnElement(clickOnEditPen);


    }
    By jobTabOption = (By.xpath("//span[normalize-space()='Job']"));
    public void jobTabOption(){
        mouseHoverToElementAndClick(jobTabOption);
    }
    By jobTitlesTab = (By.xpath("//a[normalize-space()='Job Titles']"));
    public void infoAboutUser(){
        mouseHoverToElementAndClick(jobTitlesTab);
    }
    By payGradesTab = (By.xpath("//a[normalize-space()='Pay Grades']"));
    public void payGradesTab(){
        mouseHoverToElementAndClick(payGradesTab);
    }
    By employmentStatusTab = (By.xpath("//a[normalize-space()='Employment Status']"));
    public void employmentStatusTab(){
        mouseHoverToElementAndClick(employmentStatusTab);
    }
    By jobCategoriesTab =(By.xpath("//a[normalize-space()='Job Categories']"));
    public void jobCategoriesTab(){
        mouseHoverToElementAndClick(jobCategoriesTab);
    }
    By workShifts = (By.xpath("//a[normalize-space()='Work Shifts']"));
    public void workShifts(){
        mouseHoverToElementAndClick(workShifts);
    }

}
