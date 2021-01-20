package appiumtest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class TestCases extends appiumBaseClass {

	
	@Test
	public void SelectMonth()
	{
		MobileElement NavBtn= driver.findElement(By.id("com.samsung.android.calendar:id/open_drawer"));
		MobileElement MonthBtn= driver.findElement(By.id("com.samsung.android.calendar:id/two_line_title_main"));
		
		
		
		MonthBtn.click();
		MobileElement SelectFirstMonth= driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"January, Not selected, Button\"]/android.widget.Button"));
		
		SelectFirstMonth.click();
		
		
	}
	

}
