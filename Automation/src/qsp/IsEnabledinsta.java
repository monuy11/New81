package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledinsta {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.instagram.com/");
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		boolean button = driver.findElement(By.name("login")).isEnabled();
		//boolean button = driver.findElement(By.xpath("(//div[.='Log in'])[2]")).isEnabled();
		if (button==true) {
			System.out.println("button is enabled");
		} else {
			System.out.println("button is disabled");
		}
		driver.close();
	}

}
