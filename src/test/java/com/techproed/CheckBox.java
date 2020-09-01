package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBox {

//    Go to https://the-internet.herokuapp.com/checkboxes

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @Test
    public void checkboxTest() throws InterruptedException {
        //    Locate the elements of checkboxes
        WebElement checkbox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        //    Then click on checkbox1 if box is not selected
        //    How do you know if a checkbox is selected or not?
        //    Answer: isSelected(); method

        if (!checkbox1.isSelected()){
            checkbox1.click();
        }

        //    Then click on checkbox2 if box is not selected
        if(!checkbox2.isSelected()) {
            checkbox2.click();
        }

    }

    @After
    public void tearDown(){
        driver.close();
    }
}
