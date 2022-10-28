package com.bhaskar.selenium.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifeyeTest {
	
@BeforeMethod
@Parameters({"browser"})
public void method( @Optional("Abc") String browser) {
	System.out.println(browser);
	
}
	
  @Test(dataProvider = "names", dataProviderClass= DataProviderUtil.class)
  public void WebloginHomeloan(String name) {
	  System.out.println("WebloginHomeloan"+name);
	  
  }
  @Test(groups={"smoke"},dataProvider = "number", dataProviderClass= DataProviderUtil.class)
  public void MobileloginHomeloan(int i) {
	  System.out.println("MobileloginHomeloan"+i);
	  
	   }
  	@Test(dataProvider = "complex", dataProviderClass= DataProviderUtil.class)
  	public void LoginApihomepage(String name,int j) {
  		System.out.println("LoginApihomepage"+name+" "+j);
  		
  	}
  	
  	
  	@Test 
  	@Parameters({"browser"})
  	public void Demo(@Optional("xyz") String browser) {
  		System.out.println("Demo"+browser);
  		
  		
  		
  	}
  


}
