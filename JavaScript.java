package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.MoreObjects.ToStringHelper;

public class JavaScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		
		//1. firstly we need to create reference JavascriptExecutor 
		//execuator interface
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//2 . in JavascriptExecutor execuator interfec we have 2 method
		
		driver.findElement(By.name("uid")).sendKeys("roshan");
		driver.findElement(By.name("password")).sendKeys("ram");
		
		WebElement login = driver.findElement(By.name("btnLogin"));
		
		//3.we will use below javascript to link on login button.
//		js.executeScript("arguments[0].click();",login);
//		
//		//4  we will use below javascript to handle the alert.
//		js.executeScript("alert(user or password is not valid');");
		
		String domainName = js.executeScript("return document.domain;").toString();
		System.out.println(domainName);
		
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		String url = js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		//5 .we will use below script to launch the new url
		js.executeScript("window.location='https://demo.guru99.com/test/facebook.html'");
		

	}

}
