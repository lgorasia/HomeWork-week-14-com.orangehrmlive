package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    ViewSystemUsersPage viewSystemUsersPage;
    AddUserPage addUserPage;

    @BeforeMethod
    public void inIt(){
    loginPage = new LoginPage();
    homePage = new HomePage();
    viewSystemUsersPage = new ViewSystemUsersPage();
    addUserPage = new AddUserPage();
    }


    @Test(groups = {"sanity","smoke","regression"})
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        loginPage.clickOnUserName("Admin");
        loginPage.clickOnPassword("admin123");
        loginPage.clickOnLogInButton();
        homePage.clickOnAdmin();
       String actualText = viewSystemUsersPage.systemUserText();
       String expectedText = "System Users";
        Assert.assertEquals(actualText,expectedText);
        viewSystemUsersPage.clickOnAddButton();
        String addUserDisplayText = viewSystemUsersPage.addUserText();
        String actualMessage = addUserDisplayText.substring(0,3);
        String expectedMessage = "Add";
        Assert.assertEquals(actualMessage,expectedMessage);
        viewSystemUsersPage.clickOnUserRole("Admin");
        viewSystemUsersPage.clickOnEmployee("Ananya Dash");
        viewSystemUsersPage.clickOnUserName("3dashananya");
        viewSystemUsersPage.clikcOnStatus("Disabled");
        viewSystemUsersPage.clickOnPassWord("123456789");
        viewSystemUsersPage.clickOnConfirmPassWord("123456789");
        viewSystemUsersPage.clickOnSaveButton();
         }
      @Test(groups = {"sanity","regression"})
    public  void searchTheUserCreatedAndVerifyIt(){
          loginPage.clickOnUserName("Admin");
          loginPage.clickOnPassword("admin123");
          loginPage.clickOnLogInButton();
          homePage.clickOnAdmin();
          String actualText = viewSystemUsersPage.systemUserText();
          String expectedText = "System Users";
          Assert.assertEquals(actualText,expectedText);
          addUserPage.clickOnUserName("3dashananya");
          addUserPage.clickOnUserRole("All");
          addUserPage.clickOnStatus("Disabled");
          addUserPage.clickOnSearchButton();
      }
      @Test(groups = {"regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully(){
          loginPage.clickOnUserName("Admin");
          loginPage.clickOnPassword("admin123");
          loginPage.clickOnLogInButton();
          homePage.clickOnAdmin();
          String actualText = viewSystemUsersPage.systemUserText();
          String expectedText = "System Users";
          Assert.assertEquals(actualText,expectedText);
          addUserPage.clickOnUserName("dashananya");
          addUserPage.clickOnUserRole("All");
          addUserPage.clickOnStatus("Disabled");
          addUserPage.clickOnSearchButton();
          addUserPage.clickOnSelectionButton();
          addUserPage.clickOnDeletButton();
          addUserPage.clickOnOK();

      }
      @Test(groups = {"regression"})
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
          loginPage.clickOnUserName("Admin");
          loginPage.clickOnPassword("admin123");
          loginPage.clickOnLogInButton();
          homePage.clickOnAdmin();
          String actualText = viewSystemUsersPage.systemUserText();
          String expectedText = "System Users";
          Assert.assertEquals(actualText,expectedText);
          addUserPage.clickOnUserName("3dashananya");
          addUserPage.clickOnUserRole("All");
          addUserPage.clickOnStatus("Disabled");
          addUserPage.clickOnSearchButton();

      }


}
