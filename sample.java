package com.MainApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample {


	public static void main(String[] args) {

		
		System.setProperty("webdriver,chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
	
		WebElement button = driver.findElement(By.xpath("//*[@id=\'OKTab\']/button"));
		button.click();
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
		
//		String text =driver.switchTo().alert().getText();
//		System.out.println(text);
	
	   driver.switchTo().alert().accept();
	   
	  // driver.switchTo().alert().dismiss();
	   
	//  String text=driver.switchTo().alert().getText();
	  // System.out.println(text);
	   
	   driver.switchTo().alert().sendKeys("roshan");
	   driver.switchTo().alert().sendKeys("roshan");
		
		

	}
}
		



