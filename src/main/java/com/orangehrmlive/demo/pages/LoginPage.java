package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement userNameField;
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement loginButtonField;
    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement loginPanelTextField;

    public void clickOnUserName(String username){
        sendTextToElement(userNameField,username);
    }
    public void clickOnPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLogInButton(){
        clickOnElement(loginButtonField);
    }
    public String loginPanelText(){
        return getTextFromElement(loginPanelTextField);
    }

}
