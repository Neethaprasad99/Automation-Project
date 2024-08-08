package testpkg;

import org.testng.annotations.Test;


import basepkg.EbayBasee;
import pagepkg.EbayPagee;

public class EbayTestt {
	public class EbayTest extends EbayBasee {
		@Test
		
		public void logintest() throws InterruptedException  {
			EbayPagee ob= new EbayPagee(driver);
			
			ob.loginclick();
			ob.sendvalues();
	        ob.dropdown();
	        ob.searching();
	        ob.cart();
	        ob.logout();
		}
		
	}
	
}
