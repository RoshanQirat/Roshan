package com.MainApp;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SinleAndMultiplechkbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome","D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
//		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[00211224100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000@id=\"basicBootstrapForm\"]/div[6]/label"));
//		int size = checkboxes.size();
//		//System.out.println(size);//sysout
	
//		
//		WebElement cbox1= driver.findElement(By.id("checkbox1"));
//		cbox1.click();
//		WebElement cbox2= driver.findElement(By.id("checkbox2"));
//		cbox2.click();
//		WebElement cbox3= driver.findElement(By.id("checkbox3"));
//		cbox3.click();
		
			List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		

			int Size = checkboxes.size();
			for(int i=0; i<Size; i++)
				{
					String value =checkboxes.get(i).getAttribute("Value");//			
					//getattribute method is used to fetch the value of elements attribute as per given key
		
					if (value.equalsIgnoreCase("movie,cricket,hockey"));
					{
						checkboxes.get(i).click();
					}
			}
				
				for(int i1=0; i1<Size; i1++)
					{
					  //getattribute method is used to fetch the value of element
						String value1 = checkboxes.get(i1).getAttribute("value");
						if(value1.equalsIgnoreCase("movie,cricket,hockey")) //here we take cheack box value capital as wel small letter. 
					//if(	value.equals("Cricket"));
						{
							checkboxes.get(i1).click();
						}
					}
		

		
		


		}
	    
	}


