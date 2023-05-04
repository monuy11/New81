package Com.Actitime.Testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTesting {
	
	@Test
	public void createCustomer() {
		Reporter.log("hii",true);
	}
	@Test(invocationCount = 3)
	public void sheela() {
		Reporter.log("kaise ho baby",true);
	}
	
	@Test
	public void joblelo() {
		Reporter.log("job de diya",true);
	}
	
	@Test
	public void babubhaiya() {
		Assert.fail();
		Reporter.log("hera pheri",true);
		
	}
	

}
