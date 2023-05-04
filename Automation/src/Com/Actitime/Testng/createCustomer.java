package Com.Actitime.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class createCustomer extends BaseClass {
	
	@Test
	public void customer() {
		Reporter.log("Customer created",true);
	}
	
	@Test
	public void delete() {
		Reporter.log("customer deleted",true);
	}

}
