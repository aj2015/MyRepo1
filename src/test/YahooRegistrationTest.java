package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class YahooRegistrationTest {
	@Test(dataProvider = "registerData")
	public void testRegister(String UserName, String Password,
			String Email, String City){
		//Selenium code to register user
		//username
		//password
		//email
		//city
		System.out.println(UserName  +".........." + Password  +"......."+ Email +"....."+ City);
	}
	
	@DataProvider
	public Object [] [] registerData(){
		//rows number of times test has to be repeated
		// cols number of parameters
		Object [] [] data = new Object [3] [4];
		//first row
		data [0] [0] = "User1";
		data [0] [1] = "Pass1";
		data [0] [2] = "Email1";
		data [0] [3] = "City1";
		
		//Second row
				data [1] [0] = "User2";
				data [1] [1] = "Pass2";
				data [1] [2] = "Email2";
				data [1] [3] = "City2";
				
				//Third row
				data [2] [0] = "User3";
				data [2] [1] = "Pass3";
				data [2] [2] = "Email3";
				data [2] [3] = "City3";		
				
				return data;
	}

}

