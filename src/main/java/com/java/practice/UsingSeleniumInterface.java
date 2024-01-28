package com.java.practice;

public class UsingSeleniumInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverExample driver = null;
		String browser = "edge";
		if(browser.equalsIgnoreCase("CHROME")) {
		driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
		driver = new Edgedriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			//driver = new firefoxDriver();
			}
		driver.get();
		driver.FindElement();
		driver.click();
		driver.sendKeys();
		
	}

}
