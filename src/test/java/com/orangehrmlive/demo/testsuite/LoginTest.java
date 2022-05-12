package com.orangehrmlive.demo.testsuite;


import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;


    @BeforeMethod
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldLoginSuccessFully() {
        loginPage.clickOnUserName("Admin");
        loginPage.clickOnPassword("admin123");
        loginPage.clickOnLogInButton();
        String fullWelcomeText = homePage.welcomeText();
        String actualWelcomeText = fullWelcomeText.substring(0, 7);
        String expectedWelcomeText = "Welcome";
        Assert.assertEquals(actualWelcomeText, expectedWelcomeText);

    }

    @Test(groups = {"sanity","regression"})
    public void verifyThatTheLogoDisplayOnHomePage() {
        loginPage.clickOnUserName("Admin");
        loginPage.clickOnPassword("admin123");
        loginPage.clickOnLogInButton();
        WebElement ImageFile = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]"));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);

        if (ImagePresent) {
            System.out.println("Image displayed.");
        } else {
            System.out.println("Image not displayed.");
        }
    }
     @Test(groups = {"regression"})
     public void verifyUserShouldLogOutSuccessFully(){
         loginPage.clickOnUserName("Admin");
         loginPage.clickOnPassword("admin123");
         loginPage.clickOnLogInButton();
         homePage.clickOnUserProfileLogo();
         homePage.clickOnLogOut();
         String actualText = loginPage.loginPanelText();
         String expectedText = "LOGIN Panel";
         Assert.assertEquals(actualText,expectedText);






    }
}

        



