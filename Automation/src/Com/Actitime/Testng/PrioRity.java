package Com.Actitime.Testng;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrioRity {
	
	@Test(priority = 3 , invocationCount = 3)
	public void adani2() {
		Reporter.log("khatam tattaa bye bye gaya",true);
	}
	
	@Test(priority = 2)
	public void adani1() {
		Reporter.log("2 lakh crore",true);
	}
	
	@Test(priority = 1)
	public void adani() {
		Reporter.log("124 billion loss",true);
	}

}

