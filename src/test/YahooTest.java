package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class YahooTest {
	
	
	@BeforeSuite	
	 public void initializeSelenium() {
		  //Selenium code
		  System.out.println("Selenium Initialize");
		  
	  }
	
	@AfterSuite	
	 public void shutdownSelenium() {
		  //Selenium code
		  System.out.println("Selenium shutdown");
		  
	  }
	
  @Test
  public void testReceivedMail() {
	  //selenium code
	  System.out.println("Receiving mail");
	  
  }
  
  @Test
  public void testSendMail() {
	  //selenium code
	  System.out.println("Sending mail");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Opening browser");
  }
  
  @AfterMethod
  public void afterMethod(){
	  System.out.println("closing browser");
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Connecting to database");
  }

  
  
  @AfterTest
  public void afterTest() {
	  System.out.println("Closing connection");
  }
}
