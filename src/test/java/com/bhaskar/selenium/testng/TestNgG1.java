package com.bhaskar.selenium.testng;

import org.testng.annotations.Test;

public class TestNgG1 {
  @Test
  public void method1() {
  }
  
 @Test(priority=1)
 public void method2() {
  }
  
 @Test(priority=2)
 public void method3() {
  }
 @Test(groups="test")  
 public void testcase1()  
 {  
     System.out.println("testcase1");  
 }  
 @Test(groups="test")  
 public void testcase2()  
 {  
     System.out.println("testcase2");  
 }  
 @Test(dependsOnGroups="test")  
 public void testcase3()  
 {  
     System.out.println("testcase3");  
 }  
 @Test(invocationCount=5)  
 public void testcase5()  
 {  
     System.out.println("testcase1");  
 }  
}  
 
	  
	  
