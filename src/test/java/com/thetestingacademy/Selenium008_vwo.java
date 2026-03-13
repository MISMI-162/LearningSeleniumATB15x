package com.thetestingacademy;

import org.jspecify.annotations.Nullable;
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


public class Selenium008_vwo {
    @Test
    public void selenium008VWO() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
       driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
       WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(80));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='js-login-form']/ul/li[13]/a")));
        WebElement newacct=driver.findElement(By.xpath("//*[@id='js-login-form']/ul/li[13]/a"));
        newacct.click();
        String parent_ID=driver.getWindowHandle();
        Set<String> win_Handle=driver.getWindowHandles();
        for(String window:win_Handle) {
            System.out.println(window);
            driver.switchTo().window(window);
        }
        Thread.sleep(900);
       WebElement email1=driver.findElement(By.xpath("//input[@data-qa='page-su-step1-v1-email']"));
        email1.sendKeys("xycdl4165@mymailnow.store");
        WebElement check=driver.findElement(By.xpath("//input[@data-qa='page-free-trial-step1-gdpr-consent-checkbox']"));
        check.click();
        Thread.sleep(100);
        WebElement login=driver.findElement(By.xpath("//button[@data-qa='page-su-submit']"));
        login.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement f_name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='first_name']")));
        f_name.sendKeys("Quality");
        WebElement l_name=driver.findElement(By.xpath("//input[@name='last_name']"));
        l_name.sendKeys("Assurance");
        WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("07895621034");
        WebElement crtacct=driver.findElement(By.xpath("//button[contains(text(),'Create Account')]"));
        crtacct.click();
        WebDriverWait wait3=new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement skipncont=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-step='free-trial-thankyou']")));
        skipncont.click();
        WebDriverWait wait4=new WebDriverWait(driver, Duration.ofSeconds(100));
        String title_1=driver.getTitle();
        System.out.println(title_1);
        Thread.sleep(60000);
        WebDriverWait wait5=new WebDriverWait(driver, Duration.ofSeconds(80));
        wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Contact VWO customer support if you want to change the data centre later.')]")));
        Actions action1=new Actions(driver);
        action1.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
        WebDriverWait wait6=new WebDriverWait(driver, Duration.ofSeconds(25));
        wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@vwo-async-click='vm.saveDataLocation()']")));
        WebElement save_DC=driver.findElement(By.xpath("//*[@vwo-async-click='vm.saveDataLocation()']"));
        save_DC.click();
     WebDriverWait wait7=new WebDriverWait(driver, Duration.ofSeconds(20));
     wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-qa='bileboheku']/div/div[2]//div[3]//button[1]")));
     WebElement vmo_Insights_Web=driver.findElement(By.xpath("//div[@data-qa='bileboheku']/div/div[2]//div[3]//button[1]"));
     vmo_Insights_Web.click();

     WebDriverWait wait8=new WebDriverWait(driver, Duration.ofSeconds(30));
     wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='task-14']")));
     WebElement connectFirstWebsite=driver.findElement(By.xpath("//div[@id='task-14']"));
     connectFirstWebsite.click();
     Thread.sleep(20000);
     WebElement add_domain=driver.findElement(By.xpath("//button[contains(text(),'Add domain')]"));
     add_domain.click();
     WebDriverWait wait9=new WebDriverWait(driver, Duration.ofSeconds(45));
     wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-qa='tetisihuvi']/div[2]/div")));
     Actions action2=new Actions(driver);
     action2.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
     WebElement html_copy= driver.findElement(By.xpath("//button[@vwo-title='Copy']"));
     html_copy.click();


        }
    }
