package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select s= new Select(day);
		//Thread.sleep(3000);
		s.selectByIndex(13);
		//Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		//Thread.sleep(3000);
		s1.selectByValue("2");
		//Thread.sleep(3000);
		WebElement year = driver.findElement(By.id("year"));
		Select s2= new Select(year);
		//Thread.sleep(3000);
		s2.selectByVisibleText("2000");
		Thread.sleep(3000);
		driver.close();
	}

}
