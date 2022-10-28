package com.bhaskar.selenium.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogiTestData {
	@Test(dataProvider = "loginTestData")
	public void verifey1(String userName, String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Assert.assertTrue(driver.findElement(By.id("Welcome")).isDisplayed());
		Thread.sleep(2000);
		driver.quit();
	}

	@DataProvider(name = "loginTestData")
	public Object[][] loginData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";

		data[1][0] = "Admin";
		data[1][1] = "test123";

		return data;
	}

	
}
