package AutomationProject.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UsermgmtClass {
	
	@FindBy(id="menu_admin_UserManagement")
	WebElement usermgmt;
	public void usermgmtclick() {
		usermgmt.click();
	}
	
	@FindBy(id="btnAdd")
	WebElement useradd;
	public void useraddclick() {
		useradd.click();
		
	}
	@FindBy(id="systemUser_userType")
	WebElement userrole;
	public void selectuserrole() {
		Select sl = new Select(userrole);
		sl.selectByVisibleText("Admin");
	}
	
	

}
