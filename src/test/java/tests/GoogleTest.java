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
		System.setProperty("webdriver.chrome.driver", "/Users/snehadhande/Downloads/Software Download/chromedriver_mac_arm64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		
	}
	
	@Test
	public void logintest() 
	{
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		
		boolean signoff = driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
		Assert.assertTrue(signoff);
	}
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
