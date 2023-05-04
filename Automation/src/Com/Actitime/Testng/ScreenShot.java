package Com.Actitime.Testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

/**
 * TO TAKE THE SCREENSHOT WE CANT GET IT DIRECTLY FROM THE METHODS OF WEBDRIVER.
 * WE HAVE TO DO TYPECASTING FOR TAKESCREENSHOT INTERFACE.
 * @author Sonu
 *
 */

public class ScreenShot {
	@Test
	public void screenshot() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot t = (TakesScreenshot) driver; // TYPECASTING FOR TAKING SCREENSHOT INTERFACE
		File scr = t.getScreenshotAs(OutputType.FILE); //TO TAKE SCREENSHOT
		File dest = new File("./ScreenShot/ss.png"); //TO STORE WE GIVE PATH
		Files.copy(scr, dest); //TO PERFRM ACTION OF STORING
		driver.close();
		
	}

}
