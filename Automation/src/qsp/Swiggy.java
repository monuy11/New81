package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.xpath("//span[.='Locate Me']")).click();
		Thread.sleep(8000);
		String hotelname = driver.findElement(By.xpath("//div[.='Chaayos Chai+Snacks=Relax']")).getText();
		System.out.println(hotelname);
		driver.close();
	}

}
