package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectcssSelector {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		Thread.sleep(5000);
		driver.close();
	}

}
