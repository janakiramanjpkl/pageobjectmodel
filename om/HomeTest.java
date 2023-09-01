package hoteltest.om;

import org.testng.annotations.Test;

import hotelrappers.Com_Utility;
import hotelrappers.Rapper_of_Hotel;

public class HomeTest extends Com_Utility {

	Rapper_of_Hotel rof1=new Rapper_of_Hotel();
	@Test
	public void validatehomepage() {
		try {
			
			launchBrowser("https://adactinhotelapp.com/");
			rof1.loginrapper();
			rof1.homepagerapper();
		}
		catch(Exception ex) {
			System.out.println("Problem While logging in homepage");
			ex.printStackTrace();
		}
	}
}
