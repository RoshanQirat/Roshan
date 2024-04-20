package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
//		//1.Using simple xpath method by using tag and attribute
//		
//		WebElement un = driver.findElement(By.xpath("//input[@id=\"email"]"));
//		WebElement pass = driver.findElement(By.xpath("//input[@name=\"pass"]"));
//        WebElement login = driver.findElement(By.xpath("//input[@value=\"Log In"]"));
        
		//2.Using and condition...........both condition are true is mandatory...
		
//		WebElement un = driver.findElement(By.xpath("//input[@id='email' and @class='inputtext']"));
//	    WebElement pass = driver.findElement(By.xpath("//input[@name='pass' and @id='pass']"));
//        WebElement login = driver.findElement(By.xpath("//input[@id=\"u_0_b\" and @value=\"Log In\"]"));
        
        //3. Using or condition.....only one condition is true is mandatory...but both are true then also ok
        
//		WebElement un = driver.findElement(By.xpath("//input[@id='email' and @class='inputtext']"));
//	    WebElement pass = driver.findElement(By.xpath("//input[@name='pass' and @id='pass']"));
//      WebElement login = driver.findElement(By.xpath("//input[@id=\"u_0_b\" and @value=\"Log In\"]"));
		
		
		//4 using contains method.
		
//       WebElement un = driver.findElement(By.xpath("//input[contains(@name,'me')]"));
//       WebElement pass = driver.findElement(By.xpath("//input[contains(@id,'ass')]"));
//       WebElement login = driver.findElement(By.xpath("//input[contains(@value,'n')]"));
		
		//5 using starts with methods......you can start letter
		
//	     WebElement un = driver.findElement(By.xpath("//input[starts-with(@name,'e')]"));
//	     WebElement pass = driver.findElement(By.xpath("//input[starts-with(@id,'pa')]"));
//         WebElement login = driver.findElement(By.xpath("//input[starts-with(@id,'u')]"));
		
//		un.sendKeys("roshan");
//		pass.sendKeys("ds");
//		login.click();
    
    //6 using text method
    
    WebElement link = driver.findElement(By.xpath("//*[text()='Agile Project']"));
	link.click();
	
		
		
	}

}
