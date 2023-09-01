package hoteltest.om;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hotelrappers.Rapper_of_Hotel;


public class LoginPageTest extends hotelrappers.Com_Utility{

	Rapper_of_Hotel rof=new Rapper_of_Hotel();
	@Test
	public void validationlogin() {
		try {
			launchBrowser("http://adactinhotelapp.com/");
			rof.loginrapper();
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Problem while Login");
		}
	}
	
}
