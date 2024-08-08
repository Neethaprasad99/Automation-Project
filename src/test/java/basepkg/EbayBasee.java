package basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class EbayBasee {
protected WebDriver driver; 
	
	@BeforeTest
	public void setup()  {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	
	}
	
	
	




