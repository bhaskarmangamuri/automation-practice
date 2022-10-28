package com.bhaskar.selenium.testng2;  
import org.testng.annotations.Test;  
  
public class module1   
{  
    @Test  
    public void test1() throws InterruptedException  
    {  
        System.out.println("Hello javaTpoint!!");  
        Thread.sleep(2000);
        System.out.println("Hello after javaTpoint!!");  
        
    }  
      
    @Test  
    public void test2()  
    {  
        System.out.println("JTP Travels");  
    }
    }  