package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionpopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.id("policynumber")).sendKeys("123");
	driver.findElement(By.id("dob")).click();
	Thread.sleep(5000);
	WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	Select s=new Select(month);
	s.selectByValue("2");
	Thread.sleep(2000);
	WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select s1 = new Select(year);
	s1.selectByVisibleText("2000");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("(//a[@class='ui-state-default'])[11]"));
	driver.findElement(By.linkText("11")).click();
	driver.findElement(By.id("alternative_number")).sendKeys("87987678");
	Thread.sleep(3000);
	driver.close();

	}

}
