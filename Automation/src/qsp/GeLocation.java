package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeLocation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		int xaxis = driver.findElement(By.id("email")).getLocation().getX();
		int yaxis = driver.findElement(By.id("email")).getLocation().getY();
		System.out.println("xaxis for email textfild is ---> "+xaxis+" yaxis for email textfild is ---> "+yaxis);
		driver.close();

	}

}
