package com.jbk.dataprovidertestng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class DPTest {
  
	 WebDriver driver=null;
	
	@BeforeSuite
	public void driverOpen() {
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	
	
	@Test(dataProvider = "loginData")
     public void loginTest(String uname, String pass,String title) {

	  
		String url="file:///F:/PARESH%20FILES/New%20folder%20(3)/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
	  
	  driver.get(url);
	  driver.findElement(By.id("email")).sendKeys(uname);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.xpath("//button")).click();
	  Assert.assertEquals(driver.getTitle(), title);
  }

  @DataProvider
  public Object[][] loginData() {
    return new Object[][] {
     new Object[] { "kiran@gmail.com", "123456","JavaByKiran | Dashboard" },
      new Object[] { "mangesh@gmail.com", "123145","JavaByKiran | Dashboard" } ,
    new Object[] { "paresh@gmail.com", "6da54621","JavaByKiran | Dashboard" },
      new Object[] { "neelam@gmail.com", "654dfg621","JavaByKiran | Dashboard" },
    new Object[] { "rahul@gmail.com", "654dgd621","JavaByKiran | Dashboard" },
    };
  }
}
