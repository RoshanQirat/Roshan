package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorMethod {

	public static void main(String[] args) {
	
		   /*Css Locator is dynamice ,because we create Css in create our way*/
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
//		//1 by using tag and class name...tag means input and class means inputtext.
//    	WebElement un = driver.findElement(By.cssSelector("input.inputtext"));
//		//WebElement pass = driver.findElement(By.cssSelector("input.inputtext"));
//    	
//    	
//    	
//    	
//    	
//		//2 by using tag and id.....here also tag means pass and and id is pass
//		//WebElement un = driver.findElement(By.cssSelector("input#inputtext"));
//		WebElement pass = driver.findElement(By.cssSelector("input#pass"));
//		
//		
//		
//		un.sendKeys("roshan");
//		pass.sendKeys("r@123");
		
		
		
		//3 by using tag and attribute.
	//	WebElement username = driver.findElement(By.cssSelector("input[type='text']"));
//		WebElement pass = driver.findElement(By.cssSelector("input[type='password'][class='inputtext']"));
			
			
	   //4 by using tag,and class and attribute.
		
		//WebElement username = driver.findElement(By.cssSelector("input.inputtext[name='email'][id='email'][tabindex='1']"));
		//WebElement password = driver.findElement(By.cssSelector("input.inputtext[type='password'][tabindex='2']"));
		
		
		//username.sendKeys("roshan");
		//password.sendKeys("r123");
		
		
		
		
		
//		
////		//5 by using Tag##id and attribute.
//		WebElement username = driver.findElement(By.cssSelector("input#email[type='text'][name='email'][tabindex='1']"));
//		WebElement password = driver.findElement(By.cssSelector("input#pass[name='pass'][tabindex='2']"));
//		WebElement login = driver.findElement(By.cssSelector("label#loginbutton[class='uiButton uiButtonConfirm'][for='u_0_b']"));
//		
//		username.sendKeys("rtam");
//		password.sendKeys("rt123");
//		login.click();
		
		
		//6 by using starts with-it will be find locator staring character.
		
		WebElement username = driver.findElement(By.cssSelector("input[name^='email']"));
        username.sendKeys("roshan");
        
        //7 ends with -it will find the locator based on ending character.
        WebElement password = driver.findElement(By.cssSelector("input[type$='password'"));
	    password.sendKeys("ram");
	    
	    //8 by using the contains-it will find the locator based on character which is present or not.
	    
	    WebElement login = driver.findElement(By.cssSelector("input#u_o_b[type*=bm']"));
	    login.click();
	    
	    
	    
	    
	}

}
