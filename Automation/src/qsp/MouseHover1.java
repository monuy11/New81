package qsp;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover1 {
	static {
		System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.vtiger.com/");
		WebElement target = driver.findElement(By.partialLinkText("Resources"));
        Actions a=new Actions(driver);
        a.moveToElement(target).perform();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Contact ")).click();
        String text = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]")).getText();
        System.out.println(text);
        driver.close();
	}

}
