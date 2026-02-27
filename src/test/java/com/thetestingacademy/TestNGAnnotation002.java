package com.thetestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAnnotation002 {
    @Test
    public void test_case_002() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement button_mkapt=driver.findElement(By.id("btn-make-appointment"));
        button_mkapt.click();
        WebElement user_name=driver.findElement(By.id("txt-username"));
        user_name.sendKeys("John Doe");
        WebElement user_pass=driver.findElement(By.id("txt-password"));
        user_pass.sendKeys("TA");
        WebElement login_button=driver.findElement(By.id("btn-login"));
        login_button.click();
        Thread.sleep(200);
        WebElement error_message=driver.findElement(By.xpath("//p[@class='lead text-danger']"));
        String error_msg1=error_message.getText();
        Assert.assertTrue(error_msg1.contains("Login failed!"), "Login failed! Please ensure the username and password are valid.");
    }
}
