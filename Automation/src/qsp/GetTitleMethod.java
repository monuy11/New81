package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	static {
		System.setProperty("webdeiver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		//System.setProperty("webdeiver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapchat.com/");
		//String title = driver.getTitle();
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		driver.quit();
	}

}
