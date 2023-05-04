package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAll {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Sonu/Desktop/Hotelmenu.html");
		WebElement menu = driver.findElement(By.id("menu"));
		Select s = new Select(menu);
		Thread.sleep(3000);
		s.selectByValue("cl");
		Thread.sleep(3000);
		s.selectByVisibleText("chichen Biriyani");
		Thread.sleep(3000);
		s.selectByIndex(8);
		Thread.sleep(3000);
		s.deselectByVisibleText("masala papad");
		Thread.sleep(3000);
		s.deselectByVisibleText("machrurian");
		Thread.sleep(3000);
		s.selectByVisibleText("coke");
		Thread.sleep(3000);
		
		String option = s.getFirstSelectedOption().getText();
		System.out.println(option);
		s.deselectAll();
		Thread.sleep(3000);
		driver.close();
		
	}

}
