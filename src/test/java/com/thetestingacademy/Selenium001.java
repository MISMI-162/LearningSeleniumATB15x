package com.thetestingacademy;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium001 {
    public static void main(String[] args) {
        System.out.println("Opening GoogleChrome");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
