package Pages;

import com.relevantcodes.extentreports.LogStatus;

import Capability.CapabilityBase;
import POM.BaseClass;
import POM.LoginPageObject;

public class Login extends CapabilityBase{
	
	LoginPageObject loginPageObjects = new LoginPageObject();
	BaseClass baseClass = new BaseClass();
	
	public void login(String userValue, String paswordValue) {
		
		baseClass.sendKeys(loginPageObjects.userName, userValue, extentTest, "Enter User Name value");		
		baseClass.sendKeys(loginPageObjects.password, paswordValue, extentTest, "Enter password value");
			
	}
	
	public void Submit() {
		
		baseClass.click(loginPageObjects.loginButton, extentTest, "click on login submit button");
			
	}

}
