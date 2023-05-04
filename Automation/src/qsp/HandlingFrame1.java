package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Sonu/Desktop/handling%20fremes/Page1.html");
		driver.findElement(By.id("t1")).sendKeys("Q");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.id("t2")).sendKeys("J");
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.findElement(By.id("t1")).sendKeys("s");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.id("t2")).sendKeys("s");
		
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.findElement(By.id("t1")).sendKeys("P");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.id("t2")).sendKeys("P");
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
