package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTexAndPartiallLinkTextLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login.php/");
       
//          WebElement forgot = driver.findElement(By.linkText("Forgotten account?"));
//          forgot.click();
      
         WebElement forgot = driver.findElement(By.partialLinkText("For"));
         forgot.click();
       
        

	}

}
