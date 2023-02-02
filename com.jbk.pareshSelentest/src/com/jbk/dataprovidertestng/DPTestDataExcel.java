package com.jbk.dataprovidertestng;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class DPTestDataExcel {
  
	 WebDriver driver=null;
	
	@BeforeSuite
	public void driverOpen() {
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	
	
	@Test(dataProvider = "loginData")
     public void loginTest(String uname, String pass) throws InterruptedException {

	  
		String url="file:///F:/PARESH%20FILES/New%20folder%20(3)/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
	  
	  driver.get(url);
	  Thread.sleep(200);
	  driver.findElement(By.id("email")).sendKeys(uname);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.xpath("//button")).click();
	  Thread.sleep(2000);
	 Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
  }

  @DataProvider
  public Object[][] loginData() throws Exception {
	  
	  FileInputStream fis=new FileInputStream("TestData.xls");
	Workbook workbook=Workbook.getWorkbook(fis);
	Sheet sheet=workbook.getSheet("Sheet1");
	
	int rows=sheet.getRows();
	int cols=sheet.getColumns();
	
	String data[][] =new String[rows][cols];
	
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			
			Cell cell=sheet.getCell(j, i);
			String value=cell.getContents();
			
			data[i][j]=value;
			
		}
		
	}
	  return data;
  }
}
