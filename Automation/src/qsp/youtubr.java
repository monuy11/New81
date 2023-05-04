package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubr {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("search_query")).sendKeys("jhoome jo pathaan");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//yt-formatted-string[contains(.,'Jhoome Jo Pathaan Song ')]) [2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("ad-trxt:7")).click();
	}

}
