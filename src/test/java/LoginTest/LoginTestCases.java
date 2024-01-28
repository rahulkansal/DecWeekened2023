package LoginTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Capability.CapabilityBase;

public class LoginTestCases extends CapabilityBase {
	
	@Test
	public void TC_Login() {
	/*	driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		extentTest.log(LogStatus.PASS, "Entered the application url");
		driver.findElement(By.id("text")).sendKeys("Rahul");
		extentTest.log(LogStatus.PASS, "Entered the user name");
		driver.findElement(By.id("password")).sendKeys("dffsdfd");
		extentTest.log(LogStatus.PASS, "Entered the password"); */
		
		baseClass.get(testData.get("url"));
		login.login(testData.get("username"), testData.get("password"));
		
	}
	
	@Test
	public void TC_Login1() {
		baseClass.get(testData.get("url"));
		login.login(testData.get("username"), testData.get("password"));
		
	}

}
