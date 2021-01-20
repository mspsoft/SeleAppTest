package UITests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFirst {

	@Test
	public void browserTest() {
		// TODO Auto-generated method stub
		
		
		
		//System.setProperty("webdriver.chrome.driver.", "FF:\\drivers\\Chrome_Beta_driver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Reporter.log("Google launched successfuly");
		//driver.close();
		driver.quit();
		


	}

}
