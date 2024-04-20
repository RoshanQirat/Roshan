package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaytORefreash {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		
//		//1 by using the reftresh method
//		driver.navigate().refresh();
//		
//		//2. by using get and getcurrente url method
//		driver.get(driver.getCurrentUrl());
//		
//		//3. by using get currente url and add that in to navigato commands
//		driver.navigate().to(driver.getCurrentUrl());
		
		//5 bu using f5 key press
		driver.findElement(By.id("email")).sendKeys(Keys.F5);
		
//		//6 bu using Ascii value
//		driver.findElement(By.id("email")).sendKeys("\uE305");
		
	}

}
