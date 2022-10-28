package com.bhaskar.selenium.testng;

import org.testng.annotations.DataProvider;

public class DataProviderUtil {
	
  	
  	@DataProvider(name ="names")
  	public Object[][] getData(){
  		return new Object[][]{{"ramu"},{"venu"}};
  	}
  	
  	
 	@DataProvider(name ="number")
  	public Object[][] getDataNumber(){
  		return new Object[][]{{1},{2}};
  	}
 	
	@DataProvider(name ="complex")
  	public Object[][] getComplexData(){
  		return new Object[][]{{"abc",1},{"xyz",2}};
  	}


}
