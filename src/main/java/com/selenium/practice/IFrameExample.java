package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFrameExample {

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
		driver.get("https://webdriveruniversity.com/IFrame/index.html");
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("frame");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame']")));
		
		driver.findElement(By.xpath("//a[text()='Our Products']")).click();
	}

}
