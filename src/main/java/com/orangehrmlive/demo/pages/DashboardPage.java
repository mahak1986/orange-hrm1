package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {
    By leaveButton =  (By.xpath("//span[normalize-space()='Leave']"));
    public void leaveButton() {
        clickOnElement(leaveButton);
    }

    By pendingSelfReview = (By.xpath("//p[normalize-space()='(1) Pending Self Review']"));
    public void pendingSelfReview() {
        mouseHoverToElementAndClick(pendingSelfReview);
    }

    By candidateToReview =(By.xpath("//p[normalize-space()='(1) Candidate to Interview']"));
    public void candidateToReview() {
        mouseHoverToElementAndClick(candidateToReview);
    }
    By questionMarkForHelp= (By.xpath("//i[@class='oxd-icon bi-question-lg']"));
    public void questionMarkForHelp() {
        mouseHoverToElementAndClick(questionMarkForHelp);
    }

    By userDropDownTab=  (By.xpath("//span[@class='oxd-userdropdown-tab']"));
    public void userDropDownTab(){
        mouseHoverToElementAndClick(userDropDownTab);
    }

    By infoAboutUser = (By.xpath("//a[normalize-space()='About']"));
    public void infoAboutUser(){
        mouseHoverToElementAndClick(infoAboutUser);
    }
    By crossAfterPopUpOnAbout = (By.xpath("//button[normalize-space()='×']"));
    public void crossAfterPopUpOnAbout(){
        clickOnElement(crossAfterPopUpOnAbout);
    }

    By supportTabInUserInfo = (By.xpath("//a[normalize-space()='Support']"));
    public void supportTabInUserInfo() {
        mouseHoverToElementAndClick(supportTabInUserInfo);
    }

    By changePasswordInUserInfo = (By.xpath("//a[normalize-space()='Change Password']"));
    public void changePasswordInUserInfo() {
        mouseHoverToElementAndClick(changePasswordInUserInfo);
    }

    By logoutTabInUserInfo = (By.xpath("//a[normalize-space()='Logout']"));
    public void logoutTabInUserInfo() {
        mouseHoverToElementAndClick(logoutTabInUserInfo);
    }

    By assignLeave =  (By.xpath("//button[@title='Assign Leave']//*[name()='svg']"));
    public void assignLeave() {
        mouseHoverToElementAndClick(assignLeave);
    }

    By leaveList = (By.xpath("//button[@title='Leave List']//*[name()='svg']"));
    public void leaveList() {
        mouseHoverToElementAndClick(leaveList);
    }
    By timeSheets = (By.xpath("//button[@title='My Timesheet']//*[name()='svg']"));
    public void timeSheets() {
        mouseHoverToElementAndClick(timeSheets);
    }

    By applyLeave = (By.xpath("//button[@title='Apply Leave']//*[name()='svg']"));
    public void applyLeave() {
        mouseHoverToElementAndClick(applyLeave);
    }

    By myLeave = (By.xpath("//button[@title='My Leave']//*[name()='svg']"));
    public void myLeave() {
        mouseHoverToElementAndClick(myLeave);
    }

    By myTimeSheets = (By.xpath("//button[@title='My Timesheet']//*[name()='svg']"));
    public void myTimeSheets() {
        mouseHoverToElementAndClick(myTimeSheets);
    }

    By employeesOnLeaveTodayGear = (By.xpath("//i[@class='oxd-icon bi-gear-fill orangehrm-leave-card-icon']"));
    public void employeesOnLeaveTodayGear() {
        mouseHoverToElementAndClick(employeesOnLeaveTodayGear);
    }

    By clickOnHumanResourcesOnEmployeeDistributionSubUnit = (By.xpath("//span[@title='Human Resources']"));
    public void clickOnHumanResourcesOnEmployeeDistributionSubUnit() {
        mouseHoverToElementAndClick(clickOnHumanResourcesOnEmployeeDistributionSubUnit);
    }
    By clickOnUnassignedOnEmployeeDistributionSubUnit = (By.xpath("//div[6]//div[1]//div[2]//div[1]//ul[1]//li[2]//span[2]"));
    public void clickOnUnassignedOnEmployeeDistributionSubUnit() {
        mouseHoverToElementAndClick(clickOnUnassignedOnEmployeeDistributionSubUnit);
    }
    By clickOnTexasRAndDOnEmployeeDistributionByLocation = (By.xpath("//span[@title='Texas R&D']"));
    public void clickOnTexasRAndDOnEmployeeDistributionByLocation() {
        mouseHoverToElementAndClick(clickOnTexasRAndDOnEmployeeDistributionByLocation);
    }
    By clickOnUnassignedOnEmployeeDistributionByLocation = (By.xpath("//div[6]//div[1]//div[2]//div[1]//ul[1]//li[2]//span[2]"));
    public void clickOnUnassignedOnEmployeeDistributionByLocation() {
        mouseHoverToElementAndClick(clickOnUnassignedOnEmployeeDistributionByLocation);
    }
    By verifyBuzzLatestPostsText = (By.xpath("//p[normalize-space()='Buzz Latest Posts']"));
    public String verifyBuzzLatestPostsText(){
        return getTextFromElement(verifyBuzzLatestPostsText);
    }

    By verifyEmployeesOnLeaveTodayText = (By.xpath("//p[normalize-space()='Employees on Leave Today']"));
    public String verifyEmployeesOnLeaveTodayText(){
        return getTextFromElement(verifyEmployeesOnLeaveTodayText);
    }

    By verifyEmployeeDistributionBySubUnitText = (By.xpath("//p[normalize-space()='Employee Distribution by Sub Unit']"));
    public String verifyEmployeeDistributionBySubUnitText(){
        return getTextFromElement(verifyEmployeeDistributionBySubUnitText);
    }
    By verifyNoEmployeesOnLeaveTodayText = (By.xpath("//p[normalize-space()='No Employees are on Leave Today']"));
    public String verifyNoEmployeesOnLeaveTodayText(){
        return getTextFromElement(verifyNoEmployeesOnLeaveTodayText);
    }
    By stopWatchIcon = (By.xpath("//i[@class='oxd-icon bi-stopwatch']"));
    public void stopWatchIcon() {
        mouseHoverToElementAndClick(stopWatchIcon);
    }
}


