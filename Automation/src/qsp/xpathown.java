package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathown {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("ram shri ram shri ram jai jai ram");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]")).click();
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[@id='video-title' and @aria-label='Ram siya Ram siya Ram Jay jay ram-- dj_pradunya by dj_pradunya 2 months ago 7 minutes 8,821,984 views']")).click();
		driver.findElement(By.xpath("//yt-formatted-string[.='Ram siya Ram siya Ram Jay jay ram-- dj_pradunya']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[.='Skip Ad'])[2]")).click();
		
		//driver.close();
	}

}
