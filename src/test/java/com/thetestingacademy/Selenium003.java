package com.thetestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium003 {
    @Test
    public void TTA_Bank() throws InterruptedException {
        //WebDriver driver=new FirefoxDriver();
        WebDriver driver=new ChromeDriver();
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
        driver.manage().window().maximize();
        WebElement signUp= driver.findElement(By.xpath("//button[text()='Sign Up']"));
        signUp.click();
        WebElement name= driver.findElement(By.xpath("//input[@type='text']"));
        name.sendKeys("Hello1234");
        WebElement mail= driver.findElement(By.xpath("//input[@type='email']"));
        mail.sendKeys("Hello1234@test.com");
        WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys("NotPassword");
        WebElement createAccount= driver.findElement(By.xpath("//button[text()='Create Account']"));
        createAccount.click();
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://tta-bank-digital-973242068062.us-west1.run.app/";
        Assert.assertEquals(actualURL, expectedURL);
        Thread.sleep(5000);
        WebElement transfer= driver.findElement(By.xpath("//button[contains(text(),'Transfer Funds')]"));
        transfer.click();
        Thread.sleep(3000);
        WebElement transfer_amt = driver.findElement(By.xpath("//input[@type='number']"));
        transfer_amt.sendKeys("5000");
        Thread.sleep(2000);
        WebElement btn_Continue = driver.findElement(By.xpath("//button[text()='Continue']"));
        btn_Continue.click();
        Thread.sleep(200);
        WebElement btn_Confirm = driver.findElement(By.xpath("//button[text()='Confirm Transfer']"));
        btn_Confirm.click();
        Thread.sleep(200);
        WebElement dashBoard= driver.findElement(By.xpath("//button[contains(text(),'Dashboard')]"));
        dashBoard.click();
        WebElement actualAmt_1= driver.findElement(By.xpath("//h3[contains(text(),'$')]"));
        String actualAmt=actualAmt_1.getText();
        String expectedAmt= "$45,000.00";
        Assert.assertEquals(actualAmt,expectedAmt);
        driver.close();

    }
}
