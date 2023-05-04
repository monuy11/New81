package Com.Actitime.Testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
public class Adani extends BaseClass{
	@Test
	public void adani2() {
		Assert.fail();
		Reporter.log("khatam tattaa bye bye gaya",true);
	}
	
	@Test
	public void adani3() {
		Assert.fail();
		Reporter.log("khatam tattaa bye bye gaya",true);
	}
	
	
}
