package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagLocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//WebElement password = driver.findElement(By.tagName("input"));	
		//password.sendKeys("xxx");   // error will be happen
		
		WebElement login = driver.findElement(By.tagName("label"));
		login.click();
		
	    //Note: username and password tag name is same ,so cant create tagname,thats we take log in.

	}

}
