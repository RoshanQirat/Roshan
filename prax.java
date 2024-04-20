package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prax {

	

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://demo.automationtesting.in/Alerts.html");
  
    

	
	WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
	button.click();
	WebElement button1 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
	button1.click();
    

    	}

	
    
    


    
    
    
	}


