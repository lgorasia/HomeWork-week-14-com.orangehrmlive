package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcomeTextField;
    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement adminField;
    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement pimField;
    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement leaveField;
    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
    WebElement hrmLogoField;
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement userProfileLogoField;
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logoutField;

    public String welcomeText(){
        return getTextFromElement(welcomeTextField);
    }
    public void clickOnAdmin(){
        clickOnElement(adminField);
    }
    public void clickOnPIM(){
        clickOnElement(pimField);
    }
    public void clickOnLeave(){
        clickOnElement(leaveField);
    }
    public void findLogo(){
        mouseHoverToElement(hrmLogoField);
        }
        public void clickOnUserProfileLogo(){
        clickOnElement(userProfileLogoField);
        }
        public void clickOnLogOut(){
        mouseHoverToElementAndClick(logoutField);
        }
    }


