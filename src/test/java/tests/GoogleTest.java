package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	@BeforeTest
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/snehadhande/eclipse-workspace/CucumberJava/src/test/resources/Drivers.chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gooogle.com");
		
	}
	
	@Test
	public void logotest() 
	{
		boolean logo = driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(logo);
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
