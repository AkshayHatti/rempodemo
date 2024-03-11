package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Page_Objects.HomePage;

public class TC_001_login extends HomePage {
	
	

		
	
	public TC_001_login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void Login() {
		
		HomePage hp=new HomePage(driver);
		hp.clickonLogin();
		
	}
	
}