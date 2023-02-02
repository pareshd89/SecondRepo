package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jbk.POMpages.LoginPage;

public class LoginTest {
	
	@Test
	public void test01() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/PARESH%20FILES/New%20folder%20(3)/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.loginToApplication("kiran@gmail.com", "123456");
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard"  );
	}

}
