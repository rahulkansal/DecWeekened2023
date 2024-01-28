package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample {

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
		driver.get("https://www.proflowers.com/anniversary/anniversary-flowers-gifts?q=&cid=pfdts&prid=pfdtsssv");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='product image for Light of My Life Box Bouquet']")));

		driver.findElement(By.xpath("//img[@alt='product image for Light of My Life Box Bouquet']")).click();
		
		
	}

}
