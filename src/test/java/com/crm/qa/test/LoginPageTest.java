package com.crm.qa.test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.dashboardPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage lp;
    dashboardPage dash;

    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setup()
    {
        TestBase.initialization();
         dash = new dashboardPage();
         lp = new LoginPage();

    }

    @Test
    public void validateTitle()
    {
        String title = dash.getDashBoardTitlte();
        Assert.assertEquals(title,"#1 Free CRM Power Up your Entire Business Free Forever");
    }

    @Test
    public void login(){
        dash.clickLogin();
        lp.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }


}
