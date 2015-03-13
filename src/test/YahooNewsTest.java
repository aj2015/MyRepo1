package test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class YahooNewsTest {
	@Test
	public void testNews(){
		System.out.println(" Executing News Test");
		//Selenium code
		//Expected Value, Actual Value
		//Text is present
		//Link is present
		
		Assert.assertEquals("Good", "Good1");
		System.out.println("Before Assertion Test");
		try{
		Assert.assertTrue(6>11, "Error");//no error message if true
		}catch (Throwable t){
			System.out.println("Caught the Error");
		}
		Assert.assertFalse(9<1,"Error");// no error message if false
		System.out.println("After Assertion Test");
	}
	
	
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Executing News Test");
		//throw new SkipException ("Skipping Test");
  }

}
