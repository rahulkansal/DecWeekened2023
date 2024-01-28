package TestNGTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider(name = "test1",parallel=true)
	public Object[] createData1() {
	 return new Object[] 
	   { "chrome", "edge"};
	 
	}

	
	@Test(dataProvider = "test1")
	public void TC_parameter(String browserValue) throws InterruptedException {
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
		driver.get("https://facebook.com");
}
}
