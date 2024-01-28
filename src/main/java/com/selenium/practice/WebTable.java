package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

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
		driver.get("https://webdriveruniversity.com/Data-Table/index.html");
		
		int rowsCount = driver.findElements(By.xpath("//table[@id='t01']//tr")).size();
		int columnsCount = driver.findElements(By.xpath("//table[@id='t01']//tr[1]//th")).size();
		
		System.out.println(rowsCount +" ....... "+ columnsCount);
		
		
		String value =  driver.findElement(By.xpath("//table[@id='t01']//tr[4]//td[3]")).getText();
		System.out.println(value);
		
		for(int i=2;i<=rowsCount;i++) {
			for(int j=1;j<=columnsCount;j++) {
				String value1 =  driver.findElement(By.xpath("//table[@id='t01']//tr["+i+"]//td["+j+"]")).getText();
				System.out.println(value1);
			}
		}
		
	}

}
