package com.jbk.pareshSelentest.Basics01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class ActionsBasics {

	
	
		public void testActionBasic() throws Exception {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("file:///F:/PARESH%20FILES/New%20folder%20(3)/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
			Actions actions=new Actions(driver);
		   WebElement logo=driver.findElement(By.xpath("/html/body/div/center/img"));
			actions.moveToElement(logo).contextClick().build().perform();
			
			
			driver.navigate().to("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")).click();
			
			
			
			
			//WebElement webelement=driver.findElement(By.xpath("//*[@id=\"addInputName\"]"));
		
			
		}

}
