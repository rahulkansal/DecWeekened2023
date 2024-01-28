package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseExample {

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
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		
		Actions action = new Actions(driver);
		//WebElement element= driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
		
		
		//action.moveToElement(element).perform();
		//driver.findElement(By.xpath("//a[text()='Link 1']")).click();
		
		//WebElement element= driver.findElement(By.id("double-click"));
		
		//action.doubleClick(element).perform();
		
		//action.contextClick(element).perform();
		

		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		action.dragAndDrop(draggable, droppable).perform();
		
		action.sendKeys(Keys.ENTER).perform();

		
	}

}
