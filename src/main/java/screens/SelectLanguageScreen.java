package screens;

import org.openqa.selenium.support.PageFactory;

import appModule.WaitToClickOrVisibleElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelectLanguageScreen {
	
AndroidDriver<MobileElement>  driver;
WaitToClickOrVisibleElement wait = new WaitToClickOrVisibleElement();
	
	public SelectLanguageScreen(AndroidDriver<MobileElement> driver ){

        this.driver = driver;
   
	    PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    @AndroidFindBy(accessibility = "radioButtonInput0")
	private AndroidElement  radioButtonEnglish;
    
    @AndroidFindBy(accessibility = "radioButtonInputradioButton|1")
	private AndroidElement  radioButtonSinhala;
    
    @AndroidFindBy(id = "radioButtonInputradioButton|2")
	private AndroidElement  radioButtonTamil;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SELECT YOUR LANGUAGE']")
	private AndroidElement  lblLanguageSelect;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='PROCEED']")
	private AndroidElement  btnProceed;
    
    public void selectLanguage(String language){
    	
    	wait.elementVisible(driver, lblLanguageSelect);
    	
    	if(language=="English"){
    		radioButtonEnglish.click();
    		
    		 if(language=="Sinhala"){
    			radioButtonSinhala.click();
    			
    			if(language=="Tamil"){
    				radioButtonTamil.click();
    			}
    		}
    	}
    	
    }
    
    public void clickProceed(){
    	
    	btnProceed.click();
    	
    }

}
