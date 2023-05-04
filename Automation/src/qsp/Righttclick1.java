package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Righttclick1 {
	static {
		System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		WebElement target = driver.findElement(By.linkText("actiTIME Inc."));
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		Thread.sleep(5000);
		driver.quit();

}
}
