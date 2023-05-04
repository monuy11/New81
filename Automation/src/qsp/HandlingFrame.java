package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
	static {
		System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Sonu/Desktop/handling%20fremes/Page1.html");
		driver.findElement(By.id("t1")).sendKeys("Mumbai");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("Bangalore");
		Thread.sleep(5000);
		driver.close();
	}

}
