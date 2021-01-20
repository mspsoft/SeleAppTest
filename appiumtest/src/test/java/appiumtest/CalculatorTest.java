package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {

	static AppiumDriver<MobileElement> driver;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			openCalculator();
		}
		catch(Exception exp)
		{
			System.out.println("Cause"+exp.getCause());
			System.out.println("Exception"+ exp.getMessage());
			//System.out.println("Stack trace -> "+ exp.printStackTrace());
			exp.printStackTrace();
		}
	}
	public static void openCalculator() throws Exception
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "SMM31S"); //any device name
//		cap.setCapability("udid","RZ8N92KGCQZ"); // device id which we get from adb devices
		cap.setCapability("udid","192.168.0.2:5037"); // device id which we get from adb devices		
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","10"); //android version
		//cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
//		cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
	//	cap.setCapability("appActivity","com.sec.android.app.popupcalculator.converter.controller.NewUnitConverterActivity");
		
		cap.setCapability("appPackage","com.samsung.android.calendar");
		cap.setCapability("appActivity","com.samsung.android.app.calendar.activity.MainActivity");
	
		
		//url of appium server
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver= new  AppiumDriver<MobileElement>(url,cap);
		
		
		System.out.print("application started....");
		
		MobileElement NavBtn= driver.findElement(By.id("com.samsung.android.calendar:id/open_drawer"));
		MobileElement MonthBtn= driver.findElement(By.id("com.samsung.android.calendar:id/two_line_title_main"));
		
		MonthBtn.click();

		
		
	}

}
