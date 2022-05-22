package appModule;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utility.Constants;
import utility.ExcelUtils;

public class BaseClass {
	
	static public AndroidDriver<MobileElement> driver;
	
	public BaseClass() throws Exception{
		
	ExcelUtils.setExcelFile(Constants.filePath,Constants.deviceDetailsSheet);
	String deviceName = ExcelUtils.getCellData(1, 0);
	String udid = ExcelUtils.getCellData(1, 1);
	String platformName = ExcelUtils.getCellData(1, 2);
	String platformVersion = ExcelUtils.getCellData(1, 3);
	String appPackage = ExcelUtils.getCellData(1, 4);
	String appActivity = ExcelUtils.getCellData(1, 5);
	String AppiumURL = ExcelUtils.getCellData(1, 6);
	
	
	DesiredCapabilities cap= new DesiredCapabilities();
    cap.setCapability("deviceName",deviceName);
    cap.setCapability("udid",udid);
    cap.setCapability("platformName",platformName);
    cap.setCapability("platformVersion",platformVersion);
   
    cap.setCapability("appPackage",appPackage);
    cap.setCapability("appActivity",appActivity);
   
    //URL url=new URL("http://127.0.0.1:4723/wd/hub");
    driver = new  AndroidDriver<MobileElement>(new URL(AppiumURL),cap);
    
	}

}
