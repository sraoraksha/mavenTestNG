package com.crm.qa.test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.dashboardPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomePageTest extends TestBase {

    public HomePageTest(){
        super();
    }

    LoginPage lp;
    dashboardPage dash;
    HomePage homePage;

    @BeforeMethod
    public void setup(){

        TestBase.initialization();
        dash = new dashboardPage();
        lp = new LoginPage();
        dash.clickLogin();
        homePage = lp.login(prop.getProperty("username"),prop.getProperty("password"));
    }
    @Test(priority = 1)
    public void verifyHomePageTitleTest(){
        System.out.println(homePage.validateHomePageTitle());
        Assert.assertEquals(homePage.validateHomePageTitle(),"Cogmento CRM","Home Page title not matched");
    }

    @Test(priority = 2)
    public void verifyUsernameTest()
    {
        Assert.assertEquals(homePage.validateUsename(),"shriraksha rao");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
