package com.MainApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WayToOpenUrl {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        // 1.by using driver get
        driver.get("https://demo.automationtesting.in/Windows.html");
        
        //2.by using navigate method
        driver.navigate().to("https://adactin.com/HotelApp/index.php");
        
        //3.
	}

}
