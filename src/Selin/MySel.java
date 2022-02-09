package Selin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySel {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:/Users/DAnto/Documents/HTML HW/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://apple.com");
	}
}
