package com.crm.qa.base;

import com.crm.qa.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
   public static WebDriver driver;
    public static Properties prop;

    public TestBase(){

        try
        {
            prop = new Properties();
            FileInputStream fip =  new FileInputStream("/home/niveus/project/practiceProject/sample3/src/main/java/com/crm/qa/config/config.properties");
            prop.load(fip);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void initialization()
    {
        String browserName = prop.getProperty("browser");
        if (browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver","/home/niveus/Downloads/geckodriver-v0.33.0-linux32/geckodriver");
            driver =  new FirefoxDriver();
    }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));
    }

}
