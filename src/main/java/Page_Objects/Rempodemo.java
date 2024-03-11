package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rempodemo {
	
	//public static void main(String[] args) {
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https://rempo.in/");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/nav/div/div[2]/button")).click();
		
		
		
	}
	
	

}
