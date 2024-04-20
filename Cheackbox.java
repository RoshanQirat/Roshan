package com.MainApp;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cheackbox {

	

	public static void main(String[] args) {

	
		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		// 1.To click on the single checkbox we need to find out the element and need to click

//	    WebElement checkbox1  = driver.findElement(By.id("checkbox1"));
////		checkbox1.click();
//		
//		if (checkbox1.isSelected())
//		{
//			System.out.print("checkbox1 is selected by default");
//		}
//		else
//		{
//			checkbox1.click();
//		}
		
		// 2.When user want element size then we use this method.

		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		int size = checkboxes.size();
		System.out.println(size);//sysout
		
		
		// 3.if you have multiple elements and you want to perform operation on specific index you can use get method

	
	//	checkboxes.get(1).click();
		
		int i;
		for(i=0;i<size;i++)
		{
			checkboxes.get(i).click();
		}
		for(int i1=0;i<size;i++)
		{
			String value =checkboxes.get(i).getAttribute("hockey");//			
			//getattribute method is used to fetch the value of elements attribute as per given key

			if (value.equalsIgnoreCase("hockey"));
			{
				checkboxes.get(0).click();
			}
		}
		
//		for(int i2=0; i<size; i++)
//			{
//			  //getattribute method is used to fetch the value of element
//				String value = checkboxes.get(i).getAttribute("value");
//				if(value.equalsIgnoreCase("cricket")) //here we take Checkbox value capital as wel small letter. 
//			//if(	value.equals("Cricket"));
//				{
//					checkboxes.get(i).click();
//				}
//			}
	
		
	//	Note:differnece between equalsIgnoreCase and value.equals?
		}

}
