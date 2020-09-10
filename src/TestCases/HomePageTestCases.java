package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Core.BaseTest;

public class HomePageTestCases extends BaseTest{
	
	
	@Test
	public void testAccountCreation() throws InterruptedException{
		
		driver.findElement(By.id(ObjectRepo.getProperty("createNewAct"))).click();
	
	}
	
	
	

}
