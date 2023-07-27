package base;



import java.util.Properties;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.*;
import java.time.Duration;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() 
	{
		try {
		prop= new Properties();
		FileInputStream in= new FileInputStream("C:\\Testngfile\\VPWS\\BookStore\\src\\main\\java\\config\\config.properties");
		prop.load(in);
		} 
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void initilization()
	{
		
		if(prop.getProperty("browser").equals("chrome"))
		{
		
		driver = new ChromeDriver();
		
		}
		else
		{
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//below is the implicit wait to wait till the all the elements gets loaded within the specified time period.
		// in case all the elements  are loaded before the time, it will continue with the script
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0))
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.get(prop.getProperty("URL"));
		
	}
	
	
	
	

}



