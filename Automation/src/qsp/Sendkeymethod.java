package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeymethod {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("QSPIDERS");
		Thread.sleep(5000);
		driver.findElement(By.name("pwd")).sendKeys("jspiders");
		Thread.sleep(5000);
		driver.close();

	}

}
