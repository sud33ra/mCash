package testCases.Login;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appModule.BaseClass;
import appModule.LaunchApp;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import screens.GettingStart;
import screens.LoginScreen;
import screens.LoginWithPasswordScreen;
import screens.SelectLanguageScreen;
import utility.Constants;
import utility.ExcelUtils;



public class TC_001_Valid_Login {
	
static public AndroidDriver<MobileElement> driver;
	
	
	@BeforeTest
	public void beforeTest() throws Exception{
		
		LaunchApp lap = new LaunchApp();
		driver = lap.launchApp();
	}
    

	@Test (priority = 0)
	public void test1()throws Exception{
    	
    	GettingStart gs = new GettingStart(driver);
    	gs.clickGetStartedButton();
    	
    	
    	SelectLanguageScreen sl = new SelectLanguageScreen(driver);
    	sl.selectLanguage("English");
    	
    	sl.clickProceed();
    	
    	
    	LoginWithPasswordScreen lwps = new LoginWithPasswordScreen(driver);
    	lwps.enterPassword("Sudeera89");
    	lwps.clickLogin();
    	
    	Thread.sleep(8000);
    	lwps.clickMenu();
    	
    	Thread.sleep(3000);
    	lwps.clickReload();
    	//lwps.clickPayNow();
    	//lwps.click123();
    	
    	//lwps.clickReload();
    
    
	
    }

}
