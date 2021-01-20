package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class appiumBaseClass {
	
	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup()
	{
		try {
		
			//WebDriverManager.chromedriver().setup();
		//	WebDriverManager.chromedriver().browserVersion("87.0.4280.101").setup();
			
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability("chromedriverExecutable", WebDriverManager.chromedriver().getBinaryPath());
	//	cap.setCapability("chromedriverExecutable", WebDriverManager.chromedriver().driverVersion("87.0.4280.101"));
		cap.setCapability("deviceName", "SMM31S"); //any device name
		//cap.setCapability("udid","192.168.0.3:5437"); // device id which we get from adb devices
		cap.setCapability("udid","RZ8N92KGCQZ"); // device id which we get from adb devices
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","10"); //android version
		//cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
	//	cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
		//cap.setCapability("appActivity","com.sec.android.app.popupcalculator.converter.controller.NewUnitConverterActivity");
		
		cap.setCapability("appPackage","com.samsung.android.calendar");
		cap.setCapability("appActivity","com.samsung.android.app.calendar.activity.MainActivity");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT , 60); //timeout in seconds
		//cap.setCapability(MobileCapabilityType.APP ,"c:\abc.apk"); //apk file path
		
//		cap.setCapability(MobileCapabilityType.BROWSER_NAME ,"chrome");
//		cap.setCapability(MobileCapabilityType.BROWSER_VERSION ,"87.0.4280.101");
		//cap.setCapability("binary_location" ,"C:\\Users\\Sumedh\\AppData\\Roaming\\npm\\node_modules\\appium\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe");
		//cap = {'binary_location': "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe"}
		
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver= new  AppiumDriver<MobileElement>(url,cap);
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			exp.printStackTrace();
		}
		
	}
	@Test
	public void testClass()
	{
		System.out.println("This is test");

		/*
		//url of appium server
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver= new  AppiumDriver<MobileElement>(url,cap);
		
		
		System.out.print("application started....");
		
		MobileElement NavBtn= driver.findElement(By.id("com.samsung.android.calendar:id/open_drawer"));
		MobileElement MonthBtn= driver.findElement(By.id("com.samsung.android.calendar:id/two_line_title_main"));
		
		MonthBtn.click();
*/
		
	}
		
	
	
	
	@AfterTest
	public void tearDown()
	{
		//driver.close();
		//driver.quit();
	}

}
