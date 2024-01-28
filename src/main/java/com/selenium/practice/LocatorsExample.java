package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsExample {

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
		driver.get("https:google.com");
		
		//driver.findElement(By.id("APjFqb")).sendKeys("java by javatpoint");
		
		//driver.findElement(By.name("q")).sendKeys("java by javatpoint");
		
		//driver.findElement(By.className("gLFyf")).sendKeys("java by javatpoint");
		
		driver.findElement(By.linkText("हिन्दी")).click();
		
		driver.findElement(By.partialLinkText("Eng")).click();
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("Rahul AUtomation");

	driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("dddggh");
	
	//driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).clear();
	
	driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
	
	driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("Rahul ");
	
	driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys(Keys.ENTER);
	
	}

}
