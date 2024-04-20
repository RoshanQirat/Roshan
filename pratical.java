package com.MainApp;

import java.awt.Checkbox;
import java.net.PasswordAuthentication;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pratical {

	private static final String Checkbox1 = null;

	public static void main(String[] args) 
	{
		
      System.setProperty("webdriver chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromdriver.exe");
      WebDriver driver= new ChromeDriver();
      driver.get("https://demo.guru99.com/test/facebook.html");
      
  WebElement username = driver.findElement(By.xpath(""));
     
      
      

     
      
      
   
     
      
	
	}
}
