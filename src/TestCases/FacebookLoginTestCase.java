package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Core.BaseTest;

public class FacebookLoginTestCase extends BaseTest{
	
	
	//@BeforeMethod
	@Test
	public void testInvalidLogin() throws InterruptedException{
		`
		driver.findElement(By.id(ObjectRepo.getProperty("emailId"))).sendKeys(excel.getCellData("LoginData", "Username", 2));
		
		log.debug("Entering email id into facebook");
		
		driver.findElement(By.id(ObjectRepo.getProperty("password"))).sendKeys(excel.getCellData("LoginData", "Password", 2));
		
		log.debug("Entering Password into facebook");
		
		driver.findElement(By.name(ObjectRepo.getProperty("LoginButton"))).click();
		
		log.debug("Clicking on Login Button");
		
		Thread.sleep(3000);
		
		//boolean isLoginPageDisplayedAgain = driver.findElement(By.xpath(ObjectRepo.getProperty("LoginFailed"))).isDisplayed();
		
		String actualText = driver.findElement(By.xpath(ObjectRepo.getProperty("LoginFailed"))).getText();
		
		System.out.println(actualText);
		
		Assert.assertEquals("Log in to Facebook", actualText);
	
		
		log.debug("Varification is done so I am done with Test case");
		
		//Assert.assertTrue(isLoginPageDisplayedAgain);
		
		
		//Expected Text => Log into Facebook
		
		/*if(isLoginPageDisplayedAgain){
			Assert.assertTrue(true);
		}else{
			Assert.assertTrue(false);
		}*/
	}
	
	
}
