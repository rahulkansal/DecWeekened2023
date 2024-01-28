package TestNGTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RetryTest {

	@Test
	//@Test(retryAnalyzer=TestNGTests.MyRetry.class)
	public void facebook() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";
		SoftAssert softAssert = new SoftAssert();
		
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
		
		//softAssert.assertEquals(driver.getTitle(), "Facebook – log in or sign u");
	}
}
