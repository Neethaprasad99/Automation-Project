package pagepkg;

import javax.lang.model.element.Element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EbayPagee {
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"gh-ug\"]/a")
	WebElement loginbutton;
	
	@FindBy(id="userid")
	WebElement email;
	
	@FindBy(id="signin-continue-btn")
	WebElement conti;
	
	@FindBy(id="pass")
	WebElement pswd;
	
	@FindBy(id="sgnBt")
	WebElement signup;
	
	@FindBy(id = "gh-minicart-hover")
	WebElement cartsymbol;
	
	@FindBy(xpath="//*[@data-test-id=\"start-shopping\"]")
	WebElement startshop;
	
	@FindBy(xpath="//*[@id=\"gh-cat\"]"  )
	WebElement dropdown;
	
	@FindBy(id="gh-btn")
	WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"s0-28-9-0-1[0]-0-1[0]-0-12-list\"]/li[2]/a/div/img" )
	WebElement women;
	
	@FindBy(xpath="//*[@id=\"s0-28-9-0-1[0]-0-1[0]-0-12-list\"]/li[3]/a/div/img" )
	WebElement bag;
	
	@FindBy(xpath="//*[@id=\"s0-28_1-9-0-1[3]-0-0-12-list\"]/li[1]/div/a" )
	WebElement deals;
	
	@FindBy(id="qtyTextBox")
	WebElement quantity;
	
	@FindBy(xpath="//*[@id=\"atcBtn_btn_1\"]" )
	WebElement addtocart;
	
	@FindBy(id="gh-logo")
	WebElement home;
	
	@FindBy(xpath="//*[@id=\"gh-ug\"]/b[2]" )
	WebElement logout;
	@FindBy(xpath="//*[@id=\"gh-uo\"]/a" )
	WebElement signout;
	
	
	
	public  EbayPagee(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void loginclick() throws InterruptedException  {
		driver.navigate().refresh();
		loginbutton.click();
		Thread.sleep(2000);
		
		}
	public void sendvalues() {
	email.sendKeys("neethakottarathil@gmail.com");
	conti.click();
	pswd.sendKeys("Neetha@1999");
	signup.click();
	
	}
	
	public void dropdown() throws InterruptedException {
		cartsymbol.click();
		startshop.click();
		Select S= new Select(dropdown);
		Thread.sleep(2000);
		dropdown.click();
		Thread.sleep(3000);
		S.selectByValue("11450");
		Thread.sleep(3000);
		searchbutton.click();
	}
	public void searching() throws InterruptedException {
		
        women.click();
		bag.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true)",deals);
	    Thread.sleep(2000);
        deals.click();
     }
	public void cart() throws InterruptedException {
		quantity.clear();
		Thread.sleep(2000);
		quantity.sendKeys("2");
		addtocart.click();
		home.click();
		}
	public void logout() {
		logout.click();
		signout.click();
	}
		
}
