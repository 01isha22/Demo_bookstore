package testcases;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection.*;
import java.util.List;

public class TestcaseswithDataProvider {
	
	@DataProvider(name="logintestdata")
	public String[][] login_testdata()
	{
		String[][] data= new String[4][3];
		data[0][0]="Vijay";
		data[0][1]="Pathak";
		data[0][2]="Automation";
		
		data[1][0]="Isha";
		data[1][1]="I123";
		data[1][2]="Manual";
		
		data[2][0]="Harsh";
		data[2][1]="H123";
		data[2][2]="Manual";
		
		data[3][0]="Depesh";
		data[3][1]="D123";
		data[3][2]="Digital";
		return data;
		
		
	}
	
	@DataProvider(name="logintestdata1")
	public Iterator<String> login_testdata1()
	{
		ArrayList<String> data= new ArrayList<String>();
		data.add("Vijay");
		data.add("Isha");
		data.add("Hrash");
		return data.iterator();
		
		
	}
	
	@DataProvider(name="logintestdata2")
	public Iterator<String []> login_testdata2()
	{
		String [] data1= {"vijay","pathak","Automation"};
		String [] data2= {"Harsh","Singh","Manual"};
		String [] data3= {"Kareena","Khan","Acting"};
		
		List<String []> data= new ArrayList<String []>();
		data.add(data1);
		data.add(data2);
		data.add(data3);
		return data.iterator();
		
		
	}
	
	
	@BeforeMethod
	public void setup()
	{
		System.out.println("Set up has been done");
	}

	
//data provider is a container that provide different set of test data to test method or test cases	
//data provider annotation method return 4 type of values--Object 1d array, Object 2d array, Iterator object and Iterator Object array	
	
	
	
	@Test(dataProvider="logintestdata")
	public void testcase_withVijayUser(String username, String lastname, String department)
	{   
		
		System.out.println("Testcase executed");
		System.out.println("Fullname:"+username+lastname);
		System.out.println("Department:"+department);
		
	}
	
	
	@Test(dataProvider="logintestdata1")
	public void testcase_withVijayUser1(String username)
	{   
		
		System.out.println("Testcase executed using collection example");
		System.out.println("Fullname:"+username);
		System.out.println("Department:");
		
	}
	
	@Test(dataProvider="logintestdata2")
	public void testcase_withVijayUser2(String username,String lastname, String dept)
	{   
		
		System.out.println("Testcase executed using collection array example");
		System.out.println("Fullname:"+username+lastname);
		System.out.println("Department:"+dept);
		
	}
	
	
	
	@AfterMethod
	public void shutdown()
	{
		System.out.println("Shut down has been done. Thanks ");
	}
	

}




