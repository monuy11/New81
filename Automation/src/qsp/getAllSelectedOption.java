package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("file:///C:/Users/Sonu/Desktop/Hotelmenu.html");
        WebElement hotelmenu = driver.findElement(By.id("menu"));
        Select s= new Select(hotelmenu);
        s.selectByVisibleText("masala papad");
        s.selectByVisibleText("chicken lolipop");
        s.selectByVisibleText("machrurian");
        s.selectByVisibleText("coke");
        
        if (s.isMultiple()==true) {
        	Thread.sleep(5000);
			s.deselectAll();
		}
        Thread.sleep(5000);
        
//        List<WebElement> alloptions = s.getAllSelectedOptions();
//        int count = alloptions.size();
//        for (int i = 0; i < count; i++) {
//			String option = alloptions.get(i).getText();
//			System.out.println(option);
//		}
        driver.close();
	}

}