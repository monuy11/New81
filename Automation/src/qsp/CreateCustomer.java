package qsp;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Actime.GenericLibrary.FileLibrary;

public class CreateCustomer {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		FileLibrary f = new FileLibrary();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
        String user = f.readDataFromPropertyFile("username");
		driver.findElement(By.id("username")).sendKeys(user);
		String pwd = f.readDataFromPropertyFile("password");
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
		String data1 = f.readDataFromExcelFile("Sheet1", 1, 1);
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(data1);
		Thread.sleep(5000);
		driver.close();
	}

}
