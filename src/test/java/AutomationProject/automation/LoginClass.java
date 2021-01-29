package AutomationProject.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginClass {

	@FindBy(id="txtUsername")
	WebElement usertext;
	
	@FindBy(id="txtPassword")
	WebElement passtext;
	
	@FindBy(id="btnLogin")
	WebElement loginbtn;
	
	public void validlogin(String username, String password) {
		usertext.clear();
		usertext.sendKeys(username);
		
		passtext.clear();
		passtext.sendKeys(password);
		
		loginbtn.click();
	}
	public void invalidlogin(String username, String password) {
		usertext.clear();
		usertext.sendKeys(username);
		
		passtext.clear();
		passtext.sendKeys(password);
		
		loginbtn.click();
	}
}
