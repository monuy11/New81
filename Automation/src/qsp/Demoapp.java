package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoapp {
	static {
		System.setProperty("webdriver.chorome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sonu/Desktop/demo.html");
		Thread.sleep(5000);
		driver.findElement(By.id("a2")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
