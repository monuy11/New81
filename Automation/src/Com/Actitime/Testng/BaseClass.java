package Com.Actitime.Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver driver;
	
	@BeforeSuite
	public void databaseconnection() {
		
		Reporter.log("i have give data base connection",true);
	}
	
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("i have disconnected to database",true);
	}
	
	@BeforeClass
	public void launchBrowser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("browser is launched",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
		Reporter.log("browser is closed",true);
	}
	
	@BeforeMethod
	public void loginToActitime() {
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Reporter.log("logged in to actitime",true);
	}
	
	@AfterMethod
	public void logoutFromActitime() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("logged out to actitime",true);
	}
	
//	@Test
//	public void createCustomer() {
//		Reporter.log("customer created",true);
//	}

}
