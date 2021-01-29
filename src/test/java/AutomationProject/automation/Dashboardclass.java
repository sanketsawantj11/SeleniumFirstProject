package AutomationProject.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboardclass {
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement clicklink;
	
	
	public void adminclick() throws InterruptedException {
		clicklink.click();
		
	}

}
