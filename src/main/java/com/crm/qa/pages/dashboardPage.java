package com.crm.qa.pages;
import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboardPage extends TestBase {

    //Page factory - OR
    @FindBy(xpath = "//span[contains(text(),'Log In')]")
     WebElement loginBtn;

    @FindBy(xpath = "//span[contains(text(),'sign up')]")
     WebElement signUpBtn;

    public dashboardPage(){
        PageFactory.initElements(driver,this);
    }
    //Actions
    public void clickLogin(){
        loginBtn.click();
    }
    public String getDashBoardTitlte(){
        return driver.getTitle();
    }

    public void clickSignUp()
    {
        signUpBtn.click();
    }

}
