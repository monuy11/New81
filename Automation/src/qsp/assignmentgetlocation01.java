package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentgetlocation01 {
        static {
        	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        }
        public static void main(String[] args) {
        	WebDriver driver = new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.get("https://demo.actitime.com/login.do");
    		int xaxis = driver.findElement(By.name("username")).getLocation().getX();
    		int yaxis = driver.findElement(By.name("username")).getLocation().getY();
    		System.out.println("xaxis for username textfield is--> "+xaxis+" yaxis for username textfield is--> "+yaxis);
    		driver.close();
		}
}
