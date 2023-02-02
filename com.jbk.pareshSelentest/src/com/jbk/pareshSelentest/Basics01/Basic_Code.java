package com.jbk.pareshSelentest.Basics01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Basic_Code {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	
	String url="file:///F:/PARESH%20FILES/New%20folder%20(3)/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/logout.html";
	System.setProperty("webdriver.chrome.driver" , "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul/li[3]/a")).click();
	driver.findElement(By.xpath("//a/button")).click();
	
	WebElement web=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
	Select s=new Select(web);
	List<WebElement> allvls=s.getOptions();
	for (WebElement we1 : allvls) {
		
		String txt=we1.getText();				//FOR DISPLAYING DROP DOWN ELEMENTS
		System.out.println(txt);
	}
	
//		for (int i = 2; i <=5; i++) {
//			
//			for (int j = 2; j <8; j++) {
//				
//				String xpath="/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]" ;
//			//	System.out.println("name>>"+xpath);
//				String name=driver.findElement(By.xpath(xpath)).getText();
//				
//				System.out.println("name?>>"+name);
//			}
//			
		}

	}
	
	
		
											
