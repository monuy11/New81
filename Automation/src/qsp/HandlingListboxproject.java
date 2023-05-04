package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListboxproject {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Monu");
		driver.findElement(By.name("lastname")).sendKeys("yadav");
		driver.findElement(By.name("reg_email__")).sendKeys("234567890");
		driver.findElement(By.name("reg_passwd__")).sendKeys("monuyadav");
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select s = new Select(day);
		s.selectByIndex(10);
		WebElement month = driver.findElement(By.id("month"));
		Select s1 =  new Select(month);
		s1.selectByValue("3");
		WebElement year = driver.findElement(By.id("year"));
		Select s2 =new Select(year);
		s2.selectByVisibleText("2000");
		driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[2]")).click();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
		driver.close();
	}

}
