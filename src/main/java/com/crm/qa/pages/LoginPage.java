package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(name="email")
     WebElement email;

    @FindBy(name="password")
     WebElement password;

    @FindBy(xpath = "//div[contains(text(),'Login')]")
     WebElement loginBtn;

    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }

    public HomePage login(String un, String pwd)
    {
        email.sendKeys(un);
        password.sendKeys(pwd);
        loginBtn.click();
        return new HomePage();
    }

}
