package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class closeonlyCHILD {
	 static {
		   System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	   }
	 public static void main(String[] args) {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/browser-windows");
		String pwin = driver.getWindowHandle();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		Set<String> allwin = driver.getWindowHandles();
		for (String win : allwin) {
			driver.switchTo().window(win);
			if (!(pwin.equals(win))) {
				driver.close();
			}
			
		}
	}
}
