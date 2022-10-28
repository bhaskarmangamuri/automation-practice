package com.bhaskar.selenium.testng2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGThree {
	 @Test
	  public void m1() {
		  System.out.println("TestNGThree-m1 before thread logic");
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  Assert.fail("message");
		  System.out.println("TestNGThree-m1 after thread logic");
	  }
	  
	  @Test
	  public void abc() {
		  System.out.println("TestNGThree-abc before thread logic");
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("TestNGThree-abc after thread logic");
	  }
	  
	  @Test
	  public void xyz() {
		  System.out.println("TestNGThree-xyz before thread logic");
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("TestNGThree-xyz after thread logic");
	  }
}
