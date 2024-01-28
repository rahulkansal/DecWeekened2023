package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsExample {

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
		driver.get("https://webdriveruniversity.com/");
		
		driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']")).click();
		
		String originalWindowHandle = driver.getWindowHandle();
		System.out.println(originalWindowHandle);
		
		for (String windowHandle : driver.getWindowHandles()) {
		    if(driver.switchTo().window(windowHandle).getTitle().equalsIgnoreCase("WebDriver | Login Portal")) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		
		
		driver.findElement(By.id("text")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("password");
		
		driver.close();
		
		driver.switchTo().window(originalWindowHandle);
		
		driver.findElement(By.xpath("//h1[text()='ACTIONS']")).click();
		
		
		
	}

}
