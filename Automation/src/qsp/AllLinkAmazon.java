package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkAmazon {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		List<WebElement> alllink = driver.findElements(By.xpath("//a"));
		int count = alllink.size();
		for (int i = 0; i < count; i++) {
			String print = alllink.get(i).getText();
			System.out.println(print);
		}
		Thread.sleep(10000);
		driver.close();
	}

}
