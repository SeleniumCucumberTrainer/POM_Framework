package Core;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	
	static public WebDriver driver;
	static public Properties config;
	static public FileInputStream fis ;
	
	
	@BeforeMethod
	public void init() throws IOException{
		
		String Userpath = System.getProperty("user.dir");
		
		
		
		config = new Properties(); 
		
		fis = new FileInputStream(Userpath+"\\src\\Config\\config.properties");
		
		config.load(fis);
		
		String browserValue = config.getProperty("browser");
		
		System.out.println(browserValue);
		
		if(browserValue.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", Userpath+"\\Driver\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		}
		
		else if(browserValue.equalsIgnoreCase("Chrome")){
			
			System.setProperty("webdriver.chrome.driver", Userpath+"\\Driver\\chromedriver.exe");
		
		    driver = new ChromeDriver();
		
		}
		
		else if(browserValue.equalsIgnoreCase("ie")){
			
			System.setProperty("webdriver.ie.driver", Userpath+"\\Driver\\IEDriverServer.exe");
			
		    driver = new InternetExplorerDriver();
		
		}
		
		String url = config.getProperty("url");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		
	}
	
	
	@AfterMethod
	public void closeBrowser(){
		
		driver.quit();
		
	}
	
	
	

}
