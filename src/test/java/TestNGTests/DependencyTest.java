package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
	WebDriver driver = null;
	
	@Test
	public void serverStartedOk() {    
		
		//System.out.println("serverStartedOk");
		//Assert.assertEquals(true,false);
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("CHROME")) {
		driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			}
		
		driver.manage().window().maximize();
		driver.get("https:facebook.com");
		
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign u");
		
		
	}
	
	
	@Test(dependsOnMethods = { "serverStartedOk" },alwaysRun =false)
	public void method1() throws InterruptedException {
		
		System.out.println("method1");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		WebElement monthDropdown=driver.findElement(By.id("month"));
		
		Select dropdown = new Select(monthDropdown);
		
		//dropdown.selectByIndex(5);
		
		//dropdown.selectByVisibleText("Dec");
		
		dropdown.selectByValue("8");
		
	}

}
