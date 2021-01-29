package com.automation.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import AutomationProject.automation.AppConstant;
import AutomationProject.automation.Dashboardclass;

public class DashboardTest extends AppConstant {
	
	@Test
	public void adminclick() throws InterruptedException {
		Dashboardclass dc = PageFactory.initElements(driver, Dashboardclass.class);
		dc.adminclick();
		Thread.sleep(5000);
	}

}
