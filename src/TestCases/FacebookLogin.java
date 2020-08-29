package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Core.BaseTest;

public class FacebookLogin extends BaseTest{
	
	
	//@BeforeMethod
	
	
	
	@Test
	public void testLogin(){
		
		driver.findElement(By.id("email")).sendKeys("seleniumbesttrainer@gmail.com");
		
	}
	
	@Test
	public void testFacebookTextAvailabilityOnLoginPage(){
		
		driver.findElement(By.id("email")).sendKeys("seleniumbesttrainer@gmail.com");
		
	}
	
	

	
	//@AfterMethod
}
