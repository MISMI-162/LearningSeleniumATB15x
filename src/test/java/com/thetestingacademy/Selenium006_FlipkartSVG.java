package com.thetestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Selenium006_FlipkartSVG {
    @Test
    public void svgFlipkart() {
        System.out.println("Finding all the MacMini from Flipkart launch page with prices");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(100));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='q7ywiQ']//span[@role='button']")));
        WebElement loginClose=driver.findElement(By.xpath("//div[@class='q7ywiQ']//span[@role='button']"));
        loginClose.click();
        WebElement prdt= driver.findElement(By.name("q"));
        prdt.sendKeys("macmini");
        List<WebElement> srchIcon=driver.findElements(By.xpath("//*[local-name()='svg']"));
        srchIcon.get(2).click();
       List<WebElement> macmini=driver.findElements(By.xpath("//div[@class='RGLWAk']/a[2][contains(text(),'Mac Mini')]"));
        List<WebElement> price=driver.findElements(By.xpath("//div[@class='RGLWAk']/a[2][contains(text(),'Mac Mini')]/following-sibling::a[1]//div//div[@class='hZ3P6w']"));
       for(int i=0;i<macmini.size();i++) {
           for (int j=i;j<price.size();j++) {
               System.out.println(macmini.get(i).getText() + " " + price.get(j).getText());
               j=j+1;
           }
       }
     int lowPrice=Integer.MAX_VALUE;
       for(WebElement tprice:price) {
           String str_price= tprice.getText();
           String act_price=str_price.replace("₹","").replace(",","");
           //System.out.println(act_price);
           int iprice=Integer.parseInt((act_price));
           if(iprice<lowPrice) {
               lowPrice=iprice;
           }
       }
        System.out.println("Lowest price of mac mini is: "+lowPrice);
    }
}
