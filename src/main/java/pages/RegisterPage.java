package pages;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;



public class RegisterPage extends TestBase {
	
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement FirstName_txt;
	
	@FindBy(xpath="//input[@id='lastname']")
    WebElement LastName_txt;
	
	@FindBy(xpath=" //input[@id='userName']")
    WebElement  UserName_txt;
	
	@FindBy(xpath=" //input[@id='password']")
    WebElement  Password_txt;
	
			
	@FindBy(xpath="//button[@id='register']")
	WebElement register_btn;
	
	@FindBy(xpath="//button[@id='gotologin']")
	WebElement Backtologin_btn;
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}

	public LoginPage click_Backtologin_button() {
		// TODO Auto-generated method stub
		Backtologin_btn.click();
		
		return new LoginPage();
	}

}












