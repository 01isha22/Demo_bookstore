package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;



public class LoginPage extends TestBase {
	
	
	@FindBy(xpath="//input[@id='userName']")
	WebElement username_txt;
	
	@FindBy(id="password")
    WebElement password_txt;
	
	@FindBy(xpath="//button[@id='newUser']")
	WebElement newuser_btn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	public RegisterPage click_newuser_button() {
		// TODO Auto-generated method stub
		newuser_btn.click();
		
		return new RegisterPage();
	}

	
	}










