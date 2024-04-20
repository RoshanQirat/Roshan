package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedIsDisplayIsEnable {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
//		boolean result=username.isDisplayed();
//		boolean result1 = username.isEnabled();
//		System.out.println(result);
//		System.out.println(result);
		
		// 2 is displayed method is user to validate element is present or not.
		//   is enabled method is uesd to validate element is enable or disable
		if(username.isDisplayed() && username.isEnabled())
		{
			username.sendKeys("roshan");
		}
		else
		{
			System.out.println("username is not displayed");
		}
		if(password.isDisplayed() && password.isEnabled())
		{
			password.sendKeys("roshan");
		}
		else
		{
			System.out.println("password  is not displayed");
		}
		
		// 3 is selected method is used to validate checkbox radio button is selected or not.
		WebElement checkbox = driver.findElement(By.id("persist_box"));
		
		boolean result = checkbox.isSelected();
		System.out.println(result);
		
		
	}
	
	

}
