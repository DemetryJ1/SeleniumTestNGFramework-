package Selin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookhw {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/DAnto/Documents/HTML HW/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		WebElement createAccountbtn = driver.findElement(By.linkText("Create new account"));
		createAccountbtn.click();
		
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Automation");
		 
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Automation");
		
		WebElement reg_email__= driver.findElement(By.name("reg_email__"));
		reg_email__.sendKeys("Automation");
		
		WebElement reg_passwd__ = driver.findElement(By.name("reg_passwd__"));
		reg_passwd__.sendKeys("Automation");
		
		WebElement signUp= driver.findElement(By.name("websubmit"));
		signUp.click();
		
		
		
		

	}

}
