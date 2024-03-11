package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	//elements
	
	@FindBy(id="usernamenumber")
	WebElement txtphonenumber;
	
	@FindBy(id="remembercheckbox")
	WebElement checkbox;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div/button[1]")
	WebElement Sendotp;
	
	//actions
	
	
	public void txtphonenumber() {
		txtphonenumber.sendKeys("7020072914");
	}
	public void checkbox() {
		checkbox.click();
	}
	public void Sendotp() {
		Sendotp.click();
	}
	
	
	
	
	
	

}
