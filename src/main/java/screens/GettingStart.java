package screens;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appModule.WaitToClickOrVisibleElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GettingStart {
	
AndroidDriver<MobileElement>  driver;
	
WaitToClickOrVisibleElement wait = new WaitToClickOrVisibleElement();    
	
    public GettingStart(AndroidDriver<MobileElement> driver ){

        this.driver = driver;
   
	    PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='GET STARTED']")
	private AndroidElement  getStartedButton;
   

    public void clickGetStartedButton() throws InterruptedException{
    	
    	 
    	
    	wait.elementClickable(driver, getStartedButton);
    	
    	getStartedButton.click();

    }

}
