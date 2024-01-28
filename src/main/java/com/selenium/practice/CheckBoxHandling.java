package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxHandling {

	public static void main(String[] args) throws InterruptedException {
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
		driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-GOI-25/01/2024&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@id='listingFilterCheckbox'])[3]")).click();
		
		List<WebElement> radios = driver.findElements(By.xpath("//div[@class='fareTypeWrapper']//span[@class='appendLeft7']"));
		
		for(int i=0;i<radios.size();i++) {
			radios.get(i).click();
		}
		
		}

}
