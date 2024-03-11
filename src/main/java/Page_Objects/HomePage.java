package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
		
		@FindBy(xpath="/html/body/div/div[1]/div[1]/header/nav/div/div[2]/button")
		WebElement btnLogin;
		
		public void clickonLogin() {
			btnLogin.click();
		}
		
	
		
		
	}
	
	


