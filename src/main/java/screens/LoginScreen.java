package screens;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginScreen {
	
	AndroidDriver<MobileElement>  driver;
	
	public LoginScreen(AndroidDriver<MobileElement> driver ){

        this.driver = driver;
   
	    PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    @AndroidFindBy(xpath = "//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]/*[@class='android.view.ViewGroup'])[3]")
	private AndroidElement  pin1;
    
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='7']")
	private AndroidElement  pin2;
    
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='8']")
	private AndroidElement  pin3;
    
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='9']")
	private AndroidElement  pin4;
   

    public void enterPin() throws InterruptedException{
    	
 
    	pin1.sendKeys("7915");
    	//pin2.sendKeys("9");
    	//pin3.sendKeys("1");
    	//pin4.sendKeys("5");

    }

}
