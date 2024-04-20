package com.MainApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENUM\\software\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
	//	driver.manage().window().maximize();
		
		// 1..to fetch tha all  column the table we will use below code.
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		int size = columns.size();
		System.out.println("total no of column are"+size);
		
		for(int i =0;i<size;i++)
		{
			String columnName = columns.get(i).getText();
			System.out.println(columnName);
//			if(columnName.equalsIgnoreCase("comapny"));
//			{
//				System.out.println("we have column nameas per requirement");
//			}
		}
		
		// 2..to fetch all row data in table
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		int size1 = rows.size();
		System.out.println("total no of rows are"+size1);
		
		for(int j =0;j<size1;j++)
		{
			String rowname =rows.get(j).getText();
			System.out.println(rowname);
		}
		
		//3 .. to fetch the cell data we will use the below code
		WebElement cellData = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]/td[2]"));
        System.out.println(cellData.getText());
		
	}

}
