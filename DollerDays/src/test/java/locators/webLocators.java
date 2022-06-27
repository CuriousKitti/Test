package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataDrivenTests.loginTest;

public class webLocators {

	public static WebElement userNameLocator,passwordLocator, signInBtnLocator;

	public static WebElement[] try1() {

		WebDriver driver = loginTest.setUp();
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();

		userNameLocator = driver.findElement(By.xpath("//input[@id='inputLoginUsername']"));
		passwordLocator = driver.findElement(By.xpath("//input[@id='inputLoginPassword']"));
		signInBtnLocator = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
		

		WebElement[] obj = { userNameLocator, passwordLocator, signInBtnLocator};
		return obj;

	}

}
