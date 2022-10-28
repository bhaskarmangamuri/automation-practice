package com.bhaskar.selenium.testng2;

import org.testng.annotations.Test;

public class TestNg4 {
  @Test
  public void m4() {
	  System.out.println("m4 before method");
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("-m4 after thread logic");
	  }
  
  @Test
  public void abcd() {
	  System.out.println("abcd before abcd");
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("abcd after thread abcd ");
 
	  
	  
	  
  }
  
  
  
  
  
  }

