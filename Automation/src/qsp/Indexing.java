package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//(//span[@class='a-size-medium a-color-base a-text-normal'])[5]
public class Indexing {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[5]")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
