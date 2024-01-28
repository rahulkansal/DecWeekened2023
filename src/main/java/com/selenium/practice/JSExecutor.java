package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("CHROME")) {
		driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			}
		
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		WebElement element = driver.findElement(By.id("button4"));
		JavascriptExecutor js = (JavascriptExecutor) driver;  
        js.executeScript("arguments[0].click();", element);

	}

}
