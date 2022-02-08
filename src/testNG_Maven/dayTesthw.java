package testNG_Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dayTesthw {
	
	WebDriver driver;
	
  @BeforeMethod
  public void setup() {
	  
	  WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
		
	@Test
	public void testCase1() {
		
		driver.get("https://saucedemo.com");
		
		
		
		
		
		
	}
	
  }
