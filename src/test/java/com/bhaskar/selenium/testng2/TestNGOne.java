package com.bhaskar.selenium.testng2;

import org.testng.annotations.Test;

public class TestNGOne {
  @Test(invocationCount = 3)
  public void m1() {
	  System.out.println("TestNGOne-m1 before thread logic");
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("TestNGOne-m1 after thread logic");
  }
  
  @Test
  public void abc() {
	  System.out.println("TestNGOne-abc before thread logic");
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("TestNGOne-abc after thread logic");
  }
  
  @Test
  public void xyz() {
	  System.out.println("TestNGOne-xyz before thread logic");
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("TestNGOne-xyz after thread logic");
  }
}
