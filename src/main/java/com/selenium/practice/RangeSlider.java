package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RangeSlider {

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
		driver.get("https://www.w3schools.com/howto/howto_js_rangeslider.asp");
		
		WebElement element = driver.findElement(By.id("id1"));	
		int count = 4;
		element.click();	
		for(int i=0;i<count;i++) {
			element.sendKeys(Keys.ARROW_RIGHT);
		}

		
		
		
	}

}
