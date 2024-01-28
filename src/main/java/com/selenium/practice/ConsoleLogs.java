package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;

public class ConsoleLogs {

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
		driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-GOI-07/01/2024&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
		Thread.sleep(15000);
		LogEntries entries = driver.manage().logs().get("browser");
		List<LogEntry> logs = entries.getAll();
		
		for(LogEntry logValue : logs) {
			System.out.println(logValue.getMessage());
		}

	}

}
