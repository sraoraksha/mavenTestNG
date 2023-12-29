package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage  extends TestBase {

    //page factory - OR
    @FindBy(xpath = "//span[contains(text(),'shriraksha  rao')]")
    WebElement userNameText;

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    public String validateHomePageTitle(){
        return driver.getTitle();
    }
    public String validateUsename()
    {
        return userNameText.getText();
    }

}
