package TestNGTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SecondTests {

	
	@Test
	public void TC_SecondTest() {
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
		String value = driver.getTitle();
		System.out.println(value);
		
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		
		String pageValue = driver.getPageSource();
		System.out.println(pageValue);
		
		driver.quit();
	}
}
