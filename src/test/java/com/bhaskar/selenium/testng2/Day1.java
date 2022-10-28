package com.bhaskar.selenium.testng2;

import java.security.PublicKey;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
  @BeforeClass
  public void befoclas() {
	  System.out.println("before executing any methods in the class");
  }	  
	@Parameters({"URL","APIey/username"}) 
	@Test
	public void weblogincarLonan() {
		 System.out.println("weblogincar");
		 System.out.println("urlname");
		 System.out.println("key");
		 }
	@BeforeMethod
	public void beforeevery() {
		 System.out.println("I well execute before every test method in day 3 class ");
		 	
	
	
	}
	
}
