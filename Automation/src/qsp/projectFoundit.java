package qsp;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class projectFoundit {
	static {
		System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.foundit.in/");
		File f= new File("./Testdata/Monu_Yadav.doc");
		String path = f.getAbsolutePath();
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
		Thread.sleep(5000);
	    driver.findElement(By.id("file-upload")).sendKeys(path);
	    Thread.sleep(5000);
	    driver.close();
	
	}

}
