package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C:\\Users\\Roshan\\Downloads\\roshan_122687647.doc");
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
	}

}
