package qsp;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Sonu/Desktop/fileuploadpopup.html");
		//driver.findElement(By.id("choose")).sendKeys("C:\\Users\\Sonu\\eclipse-workspace\\Automation\\Testdata\\Monu_Yadav.doc");
		File f= new File("./Testdata/Monu_Yadav.doc");
		String path = f.getAbsolutePath();
		driver.findElement(By.id("choose")).sendKeys(path);   
		Thread.sleep(5000);
		driver.close();
		
	}

}
