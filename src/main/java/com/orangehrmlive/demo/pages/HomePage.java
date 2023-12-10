package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By searchField = (By.xpath("//input[@placeholder='Search']"));

    public void searchField(String search) {
        sendTextToElement(searchField, search);
    }

    By adminButtonOption = (By.xpath("//span[normalize-space()='Admin']"));

    public void adminButtonOption() {
        clickOnElement(adminButtonOption);
    }

    By pimButtonOption = (By.xpath("//span[normalize-space()='PIM']"));

    public void pimButtonOption() {
        clickOnElement(pimButtonOption);
    }
}

