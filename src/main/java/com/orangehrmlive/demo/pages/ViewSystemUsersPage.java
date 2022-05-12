package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUsersPage extends Utility {
    public ViewSystemUsersPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[contains(text(),'System Users')]")
    WebElement systemUserTextField;
    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addButtonField;
    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addUserTextField;
    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userRoleField;
    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement employeeNameField;
    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement userNameField;
    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement statusField;
    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement passWordField;
    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement confirmPassWordField;
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveButtonField;



    public String systemUserText(){
        return getTextFromElement(systemUserTextField);
    }
    public void clickOnAddButton(){
        clickOnElement(addButtonField);
    }
    public String addUserText(){
       return getTextFromElement(addUserTextField);
    }
    public void clickOnUserRole(String userRole){
        sendTextToElement(userRoleField,userRole);
    }
    public void clickOnEmployee(String employee){
        sendTextToElement(employeeNameField,employee);
    }
    public void clickOnUserName(String userName){
        sendTextToElement(userNameField,userName);
    }
    public void clikcOnStatus(String status){
        sendTextToElement(statusField,status);
    }
    public void clickOnPassWord(String password){
        sendTextToElement(passWordField,password);
    }
    public void clickOnConfirmPassWord(String confirmPassword){
        sendTextToElement(confirmPassWordField,confirmPassword);
    }
    public void clickOnSaveButton(){
        clickOnElement(saveButtonField);
    }

}

//
//        , Search Button, Reset Button, Add Button and Delete Button locators and
//        it's actions