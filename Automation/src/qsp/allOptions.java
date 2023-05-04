package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allOptions {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Sonu/Desktop/Hotelmenu.html");
		WebElement hotelmenu = driver.findElement(By.id("menu"));
		Select s= new Select(hotelmenu);
		String alloption = s.getWrappedElement().getText();
		System.out.println(alloption);
		Thread.sleep(5000);
		driver.close();
	}

}
