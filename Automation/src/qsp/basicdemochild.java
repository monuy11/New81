package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicdemochild {
	static {
		System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String winid = driver.getWindowHandle();
		System.out.println(winid);
		driver.close();
	}

}
