package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndClearMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
	
		//1.to clear the populated text in textbox we need to use clear method
		WebElement username = driver.findElement(By.id("email"));
	    username.sendKeys("roshan");
	    
	    //2. to clear populated text in textbox we need to use clear method
	    username.clear();
	    
	   //2.get text
	    WebElement text = driver.findElement(By.tagName("h1"));
	    //to fetch the value of paricular elements we can use geettxt method.
//	    String value= text.getText();
//	    System.out.println(value);
	    System.out.println(text.getText());
	    
//	    WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/nav/div/div/ul/li[6]/a"));
//	    element.sendKeys("Telecom Project");
	    
	    
	}

}
