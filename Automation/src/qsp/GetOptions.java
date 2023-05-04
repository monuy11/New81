package qsp;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Sonu/Desktop/Hotelmenu.html");
		
		WebElement hotelmenu = driver.findElement(By.id("menu"));
		Select s= new Select(hotelmenu);
		List<WebElement> alloption = s.getOptions();
		for (WebElement webElement : alloption) {
			String text = webElement.getText();
			System.out.println(text);
		}
		driver.close();
	}

}
