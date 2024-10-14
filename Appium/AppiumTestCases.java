package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumTestCases {
	
	AppiumDriver driver;
	
	@Test
	
	public void testMethod() throws MalformedURLException {
		UiAutomator2Options option= new UiAutomator2Options();
		option.setApp("C:\\Users\\swara\\Downloads\\ApiDemosdebug.apk");
		option.setDeviceName("Pixel 9 pro");
		URL url= new URL(" http://127.0.0.1:4723/");
		AndroidDriver driver= new AndroidDriver(url, option);
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]\r\n"
				+ "")).click();
	}

}