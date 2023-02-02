package com.jbk.pareshSelentest.Basics01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestNg {
		
	WebDriver driver;
	
		
		@BeforeSuite
		public void beforesuite() throws InterruptedException {
			
			String url="file:///F:/PARESH%20FILES/New%20folder%20(3)/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
			System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			Thread.sleep(200);
			}
		
		@BeforeMethod
		public void beforetest() {
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		}
		
		@Test
		public void titleCheck() {
			
		String actmsg=	driver.findElement(By.xpath("/html/body/div/header/a/span[2]/b")).getText();
		String expmsg="Java By Kiran";
		
		Assert.assertEquals(actmsg, expmsg);
		
		}
		
		@Test
		public void subTitle() {
			String actmsg= driver.findElement(By.xpath("/html/body/div/div[1]/a/h4")).getText();
			String expmsg="JAVA | SELENIUM | PYTHON";
			
			Assert.assertEquals(actmsg, expmsg);
			
		}
		
		@Test
		public void placeholder() {
			String actmsg= driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).getAttribute("placeholder");
			String expmsg="Email";
			
			Assert.assertEquals(actmsg, expmsg);
			
		}
		
/*		@Test
		public void placeHolderLoop() {
			
			for (int i = 2; i <3; i++) {
				
				for (int j = 1; j <3; j++) {
					
					String xpath="/html/body/div/div["+i+"]/form/div["+j+"]/input" ;
				
					String logincred =driver.findElement(By.xpath(xpath)).getAttribute("placeholder");
					System.out.println(logincred);
					String exp="Email Password";
					
					String act=logincred;	
					Assert.assertEquals(act, exp);
				}
				}
		}					*/
	
		@Test
		public void Login() {
			String actmsg= driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).getAttribute("type");
		System.out.println(actmsg);
			
		String expmsg="submit";
			
			Assert.assertEquals(actmsg, expmsg);
			
		}
		
		
		@Test
		public void hyperLink() {
			String actmsg= driver.findElement(By.xpath("/html/body/div/div[2]/a")).getText();
			String expmsg="Register a new membership";
			
			Assert.assertEquals(actmsg, expmsg);
			
		}
		
		@Test
		public void loginCheck() {
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
			
			String actmsg=	driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
			
			String expmsg="Dashboard Courses Offered";
			
			Assert.assertEquals(actmsg, expmsg);
			
		}
		
		
		@Test
		public void loginCheckFail() {
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
			
			String actmsg=	driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
			
			String expmsg="Dashboard Courses Offered";
			
			Assert.assertEquals(actmsg, expmsg);
		}
			
			
			@Test
			public void dashboardHeadLine() throws InterruptedException {
				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
				driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
				
				Thread.sleep(200);				
				String actmsg=	driver.findElement(By.xpath("/html/body/div/header/a/span[2]/b")).getText();
				
				String expmsg="Java By Kiran";
				
				Assert.assertEquals(actmsg, expmsg);
			}
			
			@Test
			public void checkDashboardMenu() throws InterruptedException {
				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
				driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
				
				Thread.sleep(200);				
				
				for (int i = 2; i < 7; i++) {
					
					String xpath="/html/body/div/aside/section/ul/li["+i+"]/a/span";
					driver.findElement(By.xpath(xpath)).click();
					
					//System.out.println(xpath);
					
					
				}
				
				
				driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[7]/a/span")).click();
		}
			
			
			
			@Test
			  public void displayOperatorList() throws Exception {
				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
				driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
				
				Thread.sleep(200);		
				driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[4]/a/span")).click();
			//driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[4]/a/span")).click();)
			for(int i=2;i<7;i++) {
				 
				    for(int j=1;j<7;j++) {
				    	
				    	String xpath= "/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+j+"]/td["+i+"]";
				    	//System.out.println(xpath);
				    	
				    	String name=driver.findElement(By.xpath(xpath)).getText();
				    	System.out.println(name);
				    }
				
			}
			
			
			}
			
			@Test
			  public void displayListDropdown() throws Exception {
			driver.findElement(By.xpath("//ul/li[3]/a")).click();
			driver.findElement(By.xpath("//a/button")).click();
			
			WebElement web=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
			Select select=new Select(web);
			
			//select.getOptions();
			
			List actualDropdownValues=new ArrayList();
			
			for (WebElement element : select.getOptions()) {
				
				actualDropdownValues.add(element.getText());
				
			}
			
			List expectedValuesDropdown=new ArrayList();
				expectedValuesDropdown.add("--Select State--");
				expectedValuesDropdown.add("Maharashtra");
				expectedValuesDropdown.add("Delhi");
				expectedValuesDropdown.add("HP");
				expectedValuesDropdown.add("Punjab");
			
				for (int i = 0; i < actualDropdownValues.size(); i++) {
					System.out.println("Actual:- "+actualDropdownValues.get(i)+" & Expected values:-  "+expectedValuesDropdown.get(i));
					Assert.assertTrue(actualDropdownValues.get(i).equals(expectedValuesDropdown.get(i)));
					
				}
				
				
			}
			
			
			@Test
			  public void tableContentCheck() throws Exception {
			driver.findElement(By.xpath("//ul/li[3]/a")).click();
			driver.findElement(By.xpath("//a/button")).click();
			
			WebElement web=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
			Select select=new Select(web);
			
			//select.getOptions();
			
			List actualDropdownValues=new ArrayList();
			
			for (WebElement element : select.getOptions()) {
				
				actualDropdownValues.add(element.getText());
				
			}
			
			List expectedValuesDropdown=new ArrayList();
				expectedValuesDropdown.add("--Select State--");
				expectedValuesDropdown.add("Maharashtra");
				expectedValuesDropdown.add("Delhi");
				expectedValuesDropdown.add("HP");
				expectedValuesDropdown.add("Punjab");
			
				for (int i = 0; i < actualDropdownValues.size(); i++) {
					System.out.println("Actual:- "+actualDropdownValues.get(i)+" & Expected values:-  "+expectedValuesDropdown.get(i));
					Assert.assertTrue(actualDropdownValues.get(i).equals(expectedValuesDropdown.get(i)));
					
				}
			
			
			}
}
				

			

			
			
							
		

		
		
		
		




	