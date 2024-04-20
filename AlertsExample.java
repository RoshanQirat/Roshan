package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		WebElement button = driver.findElement(By.xpath("//*[@id='OKTab']/button"));
		button.click();
		
	//1.To get text from alert box will use getxt method.
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
	 // 2.To accept the alert we can use accept method.
		
		//driver.switchTo().alert().accept();
//		
//		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
//		button.click();
//		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
//		button1.click();
//		
//		//3.To dismiss the alert we can use dismiss method
//		
//		driver.switchTo().alert().dismiss();
		
		
		
//		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
//		button.click();
//		
//		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
//		button1.click();
//		Thread.sleep(1000);
//		
//		//.4 to enter the text value in alert we can use sendkeys method.
//		driver.switchTo().alert().sendKeys("roshan");
//		driver.switchTo().alert().accept();
		
		
	}

}
