package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButton {

    //We create this class instance at the class level, because we can
    //reuse this class variable in the other test method.
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

    }

    @Test
    public void radioButtonTest(){
        WebElement createAccountButton=driver.findElement(By.linkText("Create New Account"));
        createAccountButton.click();
        WebElement maleButton=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        maleButton.click();
    }

    @After
    public void tearDown(){
        driver.close();
    }

}
