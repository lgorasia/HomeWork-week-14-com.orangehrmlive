package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {
    public AddUserPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
        WebElement userNameField;
    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userRoleField;
    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement statusField;
    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement searchButtonField;
    @FindBy(css = "#ohrmList_chkSelectRecord_52")
    WebElement selectionButtonField;
    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deletButtonField;
    @FindBy(id = "dialogDeleteBtn")
    WebElement okButtonField;

    public void clickOnUserName(String userName){
        sendTextToElement(userNameField,userName);
    }
    public void clickOnUserRole(String userRole){
        sendTextToElement(userRoleField,userRole);
    }
    public void clickOnStatus(String status){
        sendTextToElement(statusField,status);
    }
    public void clickOnSearchButton(){
        clickOnElement(searchButtonField);
    }
    public void clickOnSelectionButton(){
        clickOnElement(selectionButtonField);
    }
    public void clickOnDeletButton(){
        clickOnElement(deletButtonField);
    }
    public void clickOnOK(){
        clickOnElement(okButtonField);
    }




}
//    Employee Name, ,
//        Password, Confirm Password,