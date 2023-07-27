package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class RegisterPageTestcases {
	
	WebDriver driver;
	
@BeforeMethod
public void Driver_Setup()
{
	 driver= new ChromeDriver();
	driver.get("https://demoqa.com/register");
	
}

@AfterMethod
public void Driver_Exit()
{
	driver.quit();
	
}
	
	
@Test
public void Verify_HeaderContent_Register_Page()
{ 
	
	
	String register_header_expetedtext="Register";
	
	String register_header_actualtext= driver.findElement(By.xpath("//div[@class='main-header']")).getText();
Assert.assertEquals(register_header_actualtext,register_header_expetedtext ,"Titile is not there");

	
}

@Test
public void Verify_UsernamePassword_Labels_RegisterPage()
{
	String FirstName_label_expected="FirstName :";
	String LastName_label_expected="LastName   :";
	String username_label_expected="UserName :";
	String password_label_expected="Password :";
	
	
	String FirstName_label_Actual=driver.findElement(By.id("FirstName-label")).getText();
	String LastName_label_Actual=driver.findElement(By.id("LastName-label")).getText();
	String username_label_Actual=driver.findElement(By.id("userName-label")).getText();
	String password_label_Actual=driver.findElement(By.id("password-label")).getText();
	
	
	Assert.assertEquals(FirstName_label_Actual, FirstName_label_expected,"FirstName is not found");
	Assert.assertEquals(LastName_label_Actual, LastName_label_expected,"LastName is not found");
	Assert.assertEquals(username_label_Actual, username_label_expected,"Username is not found");
	Assert.assertEquals(password_label_Actual, password_label_expected,"Password is not found");
	
	
	
}
	
@Test
public void Verify_Register_text_dislayed_RegisterButton()
{

	
	String register_button_expected_text="Register";
	String register_button_actual_text=driver.findElement(By.id("register")).getText();
	Assert.assertEquals(register_button_actual_text, register_button_expected_text,"Register is not shown in Login Button");
	
	
	
}	
@Test
public void Verify_Backtologin_text_dislayed_BacktologinButton()
{

	
	String Backtologin_button_expected_text="Backtologin";
	String Backtologin_button_actual_text=driver.findElement(By.xpath("//button[@id='gotologin']")).getText();
	Assert.assertEquals(Backtologin_button_actual_text, Backtologin_button_expected_text,"Backtologin is not shown in Backtologin Button");
}	

}

