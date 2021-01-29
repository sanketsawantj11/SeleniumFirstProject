package AutomationProject.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class AppConstant {
	
	public static WebDriver driver=null;
	
	@BeforeSuite
	public void initializedriver() {
		ChromeDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@AfterSuite
	public void closedriver() {
		driver.close();
	}

}
