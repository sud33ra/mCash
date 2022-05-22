package appModule;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class WaitToClickOrVisibleElement {
	
	public AndroidDriver<MobileElement> driver;
	
	public void elementClickable(AndroidDriver<MobileElement> driver, AndroidElement element){
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(element));
	
	}
	
	public void elementVisible(AndroidDriver<MobileElement> driver, AndroidElement element){
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	

}
