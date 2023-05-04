package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project01 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		String name = driver.findElement(By.xpath("//span[contains(text(),'Lenovo IdeaPad 3 11th Gen Intel')]")).getText();
		System.out.println(name);
		driver.close();
	}

}
