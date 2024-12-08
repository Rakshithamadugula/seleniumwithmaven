package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	public static WebDriver driver;
	@BeforeTest
	public void beforeTest()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@AfterTest
	public void afterTest() {
		
	}
	@Test
	public void pageTittleValidation() {
		System.out.println(driver.getTitle());
	}
}


