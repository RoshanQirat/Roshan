package com.MainApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
	//1  if user want single radio button then we use this method.
//	  WebElement radiobutton1 = driver.findElement(By.xpath("//*[@value ='Male']"));
//	  radiobutton1.click();
//	  
//	  if(radiobutton1.isSelected()) 
//		{
//			System.out.println("radiobutton is alredy selected");
//		}
//		else
//		{
//			radiobutton1.click();
//		}
	  
	  //2 .if we user want multiple radiobutton as index wise then we use this method.
	  
	  List<WebElement> allradionButton = driver.findElements(By.xpath("//*[@type ='radio']"));
	  
		int size = allradionButton.size();
		System.out.println(size);
		
//		allradionButton.get(1).click();
		

		//3 if we user want multiple radio 2 button click then we use this method
		
		
//		for(int i =0;i<size;i++)
//		{
//			allradionButton.get(i).click();
//		}

	  
		// if we user want more than two radio button click we use this method.
		
		for(int i=0;i<allradionButton.size();i++)
			{
				String value = allradionButton.get(i).getAttribute("value");
				if(value.equalsIgnoreCase("male"))
				{
					allradionButton.get(i).click();
				}
			}
	  
		
	}

}
