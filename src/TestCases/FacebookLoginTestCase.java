package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Core.BaseTest;

public class FacebookLoginTestCase extends BaseTest{
	
	
	//@BeforeMethod
	
	
	
	@Test
	public void testInvalidLogin() throws InterruptedException{
		
		driver.findElement(By.id(ObjectRepo.getProperty("emailId"))).sendKeys(excel.getCellData("LoginData", "Username", 2));
		driver.findElement(By.id(ObjectRepo.getProperty("password"))).sendKeys(excel.getCellData("LoginData", "Password", 2));
		driver.findElement(By.name(ObjectRepo.getProperty("LoginButton"))).click();
		Thread.sleep(3000);
		
		//boolean isLoginPageDisplayedAgain = driver.findElement(By.xpath(ObjectRepo.getProperty("LoginFailed"))).isDisplayed();
		
		String actualText = driver.findElement(By.xpath(ObjectRepo.getProperty("LoginFailed"))).getText();
		
		System.out.println(actualText);
		
		Assert.assertEquals("Log in to Facebook", actualText);
		
		//Assert.assertTrue(isLoginPageDisplayedAgain);
		
		
		//Expected Text => Log into Facebook
		
		/*if(isLoginPageDisplayedAgain){
			Assert.assertTrue(true);
		}else{
			Assert.assertTrue(false);
		}*/
	}
	
	

	

	
	//@AfterMethod
}
