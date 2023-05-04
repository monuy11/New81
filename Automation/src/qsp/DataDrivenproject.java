package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenproject {
	public static void main(String[] args) throws IOException, InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream f = new FileInputStream("./Testdata/commondata.property");
		Properties p =new Properties();
		p.load(f);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
