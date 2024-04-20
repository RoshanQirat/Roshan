package com.MainApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		
		//1.firstly we will need to create object of webdriver wait class
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		//2. we will use until ,method of webdriverwait class to implement
		//the condition of exceptted class.
		
		WebElement username = driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOfAllElements(username));
		username.sendKeys("roshan");
		
		WebElement password = driver.findElement(By.id("pass"));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) password));
		password.sendKeys("ram");

		WebElement login  = driver.findElement(By.id("u_0_1"));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();


	}

}
