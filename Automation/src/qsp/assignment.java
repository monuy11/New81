package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//hread.sleep(5000);
		//driver.findElement(By.xpath("(//span[.='Apple iPhone 13 (256GB) - Blue'])[1]")).click();
		Thread.sleep(5000);
		String price = driver.findElement(By.xpath("//span[.='Apple iPhone 14 512GB Blue']/../../../../../../../div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a/span[1]/span[2]/span[2]")).getText();
		System.out.println(price);
		Thread.sleep(5000);
		driver.close();
	}

}
