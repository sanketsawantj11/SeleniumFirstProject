package com.automation.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import AutomationProject.automation.AppConstant;
import AutomationProject.automation.UsermgmtClass;

public class USermgmtTest extends AppConstant {
	
	@Test
	public void usermtmtclick() {
		UsermgmtClass uc = PageFactory.initElements(driver, UsermgmtClass.class);
		uc.usermgmtclick();
	}
	@Test
	public void useradd() throws InterruptedException {
		UsermgmtClass uc = PageFactory.initElements(driver, UsermgmtClass.class);
		uc.useraddclick();
		Thread.sleep(5000);
		
	}
	@Test
	public void selectuserrole() throws InterruptedException{
		UsermgmtClass uc = PageFactory.initElements(driver, UsermgmtClass.class);
		uc.selectuserrole();
	}

}
