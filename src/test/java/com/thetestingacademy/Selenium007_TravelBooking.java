package com.thetestingacademy;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium007_TravelBooking {
    @Test
    public void travelBooking() {
        WebDriver driver=new ChromeDriver();
        driver.get("https://booking.com/");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Dismiss sign-in info.']")));
        WebElement close= driver.findElement(By.xpath("//button[@aria-label='Dismiss sign-in info.']"));
        close.click();
        WebElement flight=driver.findElement(By.xpath("//a[@id='flights']"));
        flight.click();
        WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-ui-name='input_location_to_segment_0']")));
        WebElement destn=driver.findElement(By.xpath("//button[@data-ui-name='input_location_to_segment_0']"));
        destn.click();
        WebElement destn1=driver.findElement(By.xpath("//input[@aria-controls='flights-searchbox_suggestions']"));
        Actions action=new Actions(driver);
        action.click(destn1).keyDown(Keys.SHIFT).sendKeys("delhi").keyUp(Keys.SHIFT).keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.ENTER).build().perform();

    }
}
