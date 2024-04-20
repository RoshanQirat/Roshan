package com.MainApp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		// Firest we can create Takesceenshot reference 
		TakesScreenshot ts = (TakesScreenshot)driver;
		

		// calling getscreeshots method to create image
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		//move the file into new destination folder
		File desFile = new File("D:\\Images\\1.png");
		
		// we will copy the screeshot into destination folder.
		Files.copy(srcFile, desFile);
		
	}

}
