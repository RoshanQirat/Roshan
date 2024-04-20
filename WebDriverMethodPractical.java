package com.MainApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodPractical {


	public static void main(String[] args) 
	{
		
		//this method will help you to set the browser path which we need to use to run the automation script.
		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
		//to create chromedriver object we need to create webdriver interface
		WebDriver driver=new ChromeDriver();//create object for browser.
		
		driver.get("https://www.amazon.in/");//1.this method open url
		
//		System.out.println(driver.getTitle());//2.getTittle()- this method will help you to fetch the tittle
//		String title=driver.getTitle();
//        System.out.println(title);
//       //4.we can get use title method.
//		
//        String currenteurl=driver.getCurrentUrl();//5to get the currentlt  open url
//        System.out.println(driver.getCurrentUrl());
        
//        //5.to get the source code of open url we can use this get page source.
//        String source=driver.getPageSource();
//        System.out.println(source);
        
//        //6 all tab will be close.//differnec between quit and close ask (imp)
//        driver.quit();
		
		driver.close();//3.close()- this method will help you to  close  the current open Url.



}
}
