package com.thetestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class VMOwaits_Selenium005 {
    @Test
    public void Selenium005() {
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        WebDriverWait wait_1=new WebDriverWait(driver, Duration.ofSeconds(60));
        wait_1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login-username")));
        WebElement usr_nm=driver.findElement(By.cssSelector("#login-username"));
        usr_nm.sendKeys("admin@admin.com");
        WebElement usr_pws=driver.findElement(By.cssSelector("#login-password"));
        usr_pws.sendKeys("admin");
        WebElement login=driver.findElement((By.cssSelector("button#js-login-btn")));
        login.click();
        WebDriverWait wait_2=new WebDriverWait(driver, Duration.ofSeconds(60));
        wait_1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='notification-box-description']")));
        WebElement actMsg=driver.findElement(By.cssSelector("div[class='notification-box-description']"));
        String actualMsg=actMsg.getText();
        String expMsg= "Your email, password, IP address or location did not match";
        Assert.assertEquals(actualMsg,expMsg);
        driver.close();
    }
}
