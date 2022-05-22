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

public class LoginWithPasswordScreen {
	
AndroidDriver<MobileElement>  driver;
WaitToClickOrVisibleElement wait = new WaitToClickOrVisibleElement(); 
	
	public LoginWithPasswordScreen(AndroidDriver<MobileElement> driver ){

        this.driver = driver;
   
	    PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    @AndroidFindBy(accessibility = "textbox/password")
	private AndroidElement  txtFieldPassword;
    
    @AndroidFindBy(accessibility = "btn/Login")
	private AndroidElement  btnLogin;
    
    @AndroidFindBy(xpath = "//*[contains(text(),'Healthcare')]")
   	private AndroidElement  btnReload;
    
    @AndroidFindBy(xpath = "//*[contains(text(),'Top Up')]")
   	private AndroidElement  btnPayNow;
    
    @AndroidFindBy(xpath = "//*[@class='android.widget.ImageView' and ./parent::*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup' and ./*[@class='android.widget.FrameLayout']]]]")
   	private AndroidElement  btnMenu;
    
  
    
    @AndroidFindBy(xpath = "//*[@class='android.widget.ImageView' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Pay Mobile Bill']]")
   	private AndroidElement  btn123;
    
    
  
    
    public void enterPassword(String password){
    	
    	wait.elementVisible(driver, txtFieldPassword);
    	
    	txtFieldPassword.sendKeys(password);
    }
    
    public void clickLogin(){
    	
    	btnLogin.click();
    }
    
    public void clickReload(){
    	
    	btnReload.click();
    }
    
    public void clickPayNow(){
    	
    	btnPayNow.click();
    }
    
    public void clickMenu(){
    	
    	btnMenu.click();
    	
    }

}
