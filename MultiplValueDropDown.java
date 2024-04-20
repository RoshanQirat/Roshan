package com.MainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiplValueDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://output.jsbin.com/osebed/2");
        
        WebElement fruits = driver.findElement(By.id("fruits"));
        Select select= new Select(fruits);
        
        //1. to check the if we can select the multiple value from dropdown,we can use is multile .
        
        if(select.isMultiple())
        {
        	select.selectByIndex(0);
        	select.selectByVisibleText("Apple");
        	select.selectByValue("orange");
        }
        //2.to select by deselect by index.
        select.deselectByIndex(0);
        select.deselectByVisibleText("Apple");
        select.deselectByValue("orange");
        select.deselectAll();

	}

}
