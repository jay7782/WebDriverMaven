package webdrivermaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;
	@BeforeSuite
	public void setup() {
		driver = new FirefoxDriver();
	}
	@Test
	public void dologin() {
		driver.get("http://gmail.com/");
		driver.findElement(By.id("Email")).sendKeys("jay@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("sdsfgg");
		driver.findElement(By.id("SignIn")).click();
	}
	@AfterSuite
	public void teardown(){
		driver.quit();
	}

}
