package com.automation.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import AutomationProject.automation.AppConstant;
import AutomationProject.automation.LoginClass;

public class LoginTest extends AppConstant {
	
	@Test
	public void validlogin() {
		LoginClass lg = PageFactory.initElements(driver, LoginClass.class);
		lg.validlogin("Admin","admin123");
	}
	@Test
	public void invalidlogin() {
		LoginClass lg = PageFactory.initElements(driver, LoginClass.class);
		lg.invalidlogin("xyz","ayx123");
	}
	
	
	

}
