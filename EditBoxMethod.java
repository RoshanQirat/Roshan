package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		boolean display = driver.findElement(By.name("email")).isDisplayed();
		System.out.println(display);//true
		
		boolean enabledStaus = driver.findElement(By.name("email")).isEnabled();
		System.out.println(enabledStaus);
		
		driver.findElement(By.name("email")).sendKeys("roshan");
		String username = driver.findElement(By.name("email")).getAttribute("values");
		System.out.println(username);
		
		Thread.sleep(5000);
		//driver.findElement(By.name("email")).clear();
		driver.findElement(By.name(username)).clear();
	
				
	}

}
