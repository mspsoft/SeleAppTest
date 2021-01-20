package gridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class gridLoginTest {
	
	RemoteWebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	void setup(String br)
	{
		try {
			
			DesiredCapabilities dc = new DesiredCapabilities();
			if(br.equals("chrome"))
				dc.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
			else if (br.equals("firefox"))
				dc.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
				
			dc.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);		
			URL url = new URL("http://localhost:4444/wd/hub");
			driver = new RemoteWebDriver(url,dc);
			driver.get("https://www.nopcommerce.com/");			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void loginTest()
	{
		driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[6]/header/div/div[3]/div[1]/ul/li[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"login-page\"]/body/div[6]/header/div/div[3]/div[1]/ul/li[2]/ul/li[1]/a")).click();
		
	}
	
	@AfterTest
	void cleanup()
	{
		driver.quit();
		
	}

}
