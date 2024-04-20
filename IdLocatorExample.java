package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//to find the element by using locators firstly we need create reference variable of webelement interface and need to use below syntax.
		WebElement username = driver.findElement(By.id("email"));
		WebElement password= driver.findElement(By.id("pass"));
		WebElement login=driver.findElement(By.id("u_o_b"));
		
		//sendkeys method is used to enter the value in textbook
		username.sendKeys("roshan");
		password.sendKeys("ram");
		
		//click method is used to click on any button,radio,checkbox.
		login.click();
	}

}
