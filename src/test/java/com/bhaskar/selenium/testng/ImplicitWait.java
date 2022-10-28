package com.bhaskar.selenium.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait {
	@Test
	public void wait1() {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");
		String aTitle = driver.getTitle();
		
		if (aTitle.equals(aTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		driver.close();
	}

}
