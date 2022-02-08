package Selin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		findByName();
	}
	public static void findByName() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/DAnto/Documents/HTML HW/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		WebElement searchButton = driver.findElement(By.linkText("Sign in"));
		searchButton.click();
		
		WebElement searchBox = driver.findElement(By.name("email"));
		searchBox.sendKeys("hadiya.aden@gmail.com");
		
		WebElement searchButton2 = driver.findElement(By.id("continue"));
		searchButton2.click();
		
		
	}
		
	public static void  findByID(){

		WebDriver driver = new ChromeDriver();
			
			
		driver.get("https://amazon.com");
			
			
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			
			
		searchBox.sendKeys("coffee mug");
			
			
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
			searchButton.click();
		}

	}

