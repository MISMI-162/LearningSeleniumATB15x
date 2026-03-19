package com.thetestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Selenium009_PhotoUpload {
    @Test
    public void photoUpload() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//a[@vwo-html-translate='login:startFreeTrial']")).click();
        WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(80));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='js-login-form']/ul/li[13]/a")));
        driver.findElement(By.xpath("//*[@id='js-login-form']/ul/li[13]/a")).click();
        String parent_ID=driver.getWindowHandle();
        Set<String> win_Handle=driver.getWindowHandles();
        for(String window:win_Handle) {
            System.out.println(window);
            driver.switchTo().window(window);
        }
        Thread.sleep(15000);
        driver.findElement(By.xpath("//input[@data-qa='page-su-step1-v1-email']")).sendKeys("mjr38@iinboxes.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@data-qa='page-free-trial-step1-gdpr-consent-checkbox']")).click();
        driver.findElement(By.xpath("//button[@data-qa='page-su-submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='first_name']"))).sendKeys("Quality");;
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Assurance");;
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("07895621034");;
        driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
        WebDriverWait wait3_1=new WebDriverWait(driver, Duration.ofSeconds(45));
        wait3_1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-step='free-trial-thankyou']"))).click();
        WebDriverWait wait4_1=new WebDriverWait(driver, Duration.ofSeconds(200));
        wait4_1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Contact VWO customer support if you want to change the data centre later.')]")));
        Actions action1=new Actions(driver);
        action1.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
        WebDriverWait wait5_1=new WebDriverWait(driver, Duration.ofSeconds(60));
        wait5_1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@vwo-async-click='vm.saveDataLocation()']")));
        WebElement save_DC=driver.findElement(By.xpath("//*[@vwo-async-click='vm.saveDataLocation()']"));
        save_DC.click();
        WebDriverWait wait6_1=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait6_1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-qa='bileboheku']/div/div[2]//div[3]//button")));
        WebElement vmo_Insights_Web=driver.findElement(By.xpath("//div[@data-qa='bileboheku']/div/div[2]//div[3]//button"));
        vmo_Insights_Web.click();
        Thread.sleep(45000);
        WebDriverWait wait7_1=new WebDriverWait(driver,Duration.ofSeconds(100));
        wait7_1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-qa='nav-group'][12]"))).click();
        WebDriverWait wait8_1=new WebDriverWait(driver, Duration.ofSeconds(75));
        wait8_1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='navbar-group']//a[@aria-label='Profile details']"))).click();
        WebDriverWait wait9_1=new WebDriverWait(driver, Duration.ofSeconds(60));
        wait9_1.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Profile Details')]")))).click();
        Actions action1_1=new Actions(driver);
        action1_1.sendKeys(Keys.PAGE_DOWN).build().perform();
        driver.findElement(By.id("profile-picture-upload")).sendKeys("C:/Users/Chinmoy Das/TestUpload.jpg");
        WebDriverWait wait11_1=new WebDriverWait(driver,Duration.ofSeconds(15));
        wait11_1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Upload')]"))).click();
        WebElement preview = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Profile Picture Preview']")));

    }
}
