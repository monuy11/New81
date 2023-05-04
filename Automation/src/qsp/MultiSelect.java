package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Sonu/Desktop/Hotelmenu.html");
		WebElement menu = driver.findElement(By.id("menu"));
		Select s= new Select(menu);
		Thread.sleep(3000);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("m");
		Thread.sleep(3000);
		s.selectByVisibleText("chichen Biriyani");
		Thread.sleep(3000);
		s.selectByVisibleText("coke");
		Thread.sleep(3000);
		s.deselectByVisibleText("machrurian");
		Thread.sleep(3000);
		//s.deselectByIndex(0);
		//Thread.sleep(3000);
		//s.deselectByValue("m");
		//Thread.sleep(3000);
		driver.close();
	}
   
}
