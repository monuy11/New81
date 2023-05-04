package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com");
        JavascriptExecutor j= (JavascriptExecutor) driver;
        Thread.sleep(5000);
        int y = driver.findElement(By.xpath("//span[.='Future Planet']")).getLocation().getY();
        j.executeScript("window.scrollBy(0,"+y+")");
        //j.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(5000);
        
        driver.close();
	}

}
