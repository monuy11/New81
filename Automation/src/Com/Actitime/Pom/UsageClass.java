package Com.Actitime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsageClass {
	
	@Test
	public void LoginToActitime() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage lp= new LoginPage(driver);
		lp.login("admin", "manager");
	}
      
}
