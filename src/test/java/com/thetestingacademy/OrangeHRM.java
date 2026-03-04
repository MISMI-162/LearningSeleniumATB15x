package com.thetestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
    @Test
    public void Selenium004() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(300);
        WebElement usr_name= driver.findElement(By.name("username"));
        usr_name.sendKeys("admin");
        WebElement usr_passwd= driver.findElement(By.name("password"));
        usr_passwd.sendKeys("Hacker@4321");
        WebElement usr_login= driver.findElement(By.xpath("//button[@type='submit']"));
        usr_login.click();
        Thread.sleep(5000);
        //div[@class='oxd-table-card'][2]//div[9]//button[1]//i[1]
        WebElement usr_del= driver.findElement(By.xpath("//div[@class='oxd-table-card'][2]/div[@role='row']/div[@role='cell'][9]/child::div/button[@type='button']/i[@class='oxd-icon bi-trash']"));
        usr_del.click();
    }
}
