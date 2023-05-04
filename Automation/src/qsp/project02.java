package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project02 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://open.spotify.com/");
		//driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@placeholder='What do you want to listen to?']")).sendKeys("bombay jayashri");
		driver.findElement(By.xpath("//div[contains(text(),'Deep Focus')]")).click();
		Thread.sleep(5000);
		String song = driver.findElement(By.xpath("//div[contains(text(),'Gather')]")).getText();
		System.out.println(song);
		driver.close();
		
	}

}
