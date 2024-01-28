package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParametersExample {

	@Parameters({"browser", "url"})
	@Test
	public void TC_parameter(String browserValue, String urlValue) throws InterruptedException {
		WebDriver driver = null;
		String browser = browserValue;
		
		if(browser.equalsIgnoreCase("CHROME")) {
		driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			}
		
		driver.manage().window().maximize();
		driver.get(urlValue);
		//Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign u");
		
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		WebElement monthDropdown=driver.findElement(By.id("month"));
		
		Select dropdown = new Select(monthDropdown);
	
		dropdown.selectByValue("8");
	}
}
