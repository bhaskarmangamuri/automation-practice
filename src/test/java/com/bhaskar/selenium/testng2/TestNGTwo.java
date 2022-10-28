package com.bhaskar.selenium.testng2;

import org.testng.annotations.Test;

public class TestNGTwo {
	 @Test
	  public void m1() {
		  System.out.println("TestNGTwo-m1 before thread logic");
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("TestNGTwo-m1 after thread logic");
	  }
	  
	  @Test
	  public void abc() {
		  System.out.println("TestNGTwo-abc before thread logic");
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("TestNGTwo-abc after thread logic");
	  }
	  
	  @Test
	  public void xyz() {
		  System.out.println("TestNGTwo-xyz before thread logic");
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("TestNGTwo-xyz after thread logic");
	  }
}
