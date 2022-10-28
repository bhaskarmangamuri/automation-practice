package com.bhaskar.selenium.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Select1 {
  private static final String EmploymentStatus = null;

@Test
  public void select() {
	System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).submit();
	  //driver.get("https://opensource-demo.orangehrmlive.com/");
//	driver.findElement(By.xpath("//label[text()='Employment Status']/parent::div/following-sibling::div")).click()	;
	driver.findElement(By.xpath("//label[text()='Employment Status']/parent::div/following-sibling::div")).click()	;
	
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@role='listbox']//*[text()='Freelance']"))));
	
	
	
    driver.findElement(By.xpath("//div[@role='listbox']//*[text()='Freelance']")).click();
	
	  
	  //driver.close();
	  
  }
}
