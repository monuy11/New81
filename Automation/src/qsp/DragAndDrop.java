package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static {
		System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement src = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement dest = driver.findElement(By.xpath("//h1[.='Block 4']"));
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.dragAndDrop(src, dest).perform();
		Thread.sleep(5000);
		driver.close();
		
		

}
}
