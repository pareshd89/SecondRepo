package com.jbk.eveningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//					//div/div/div/a
public class Basic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/PARESH%20FILES/New%20folder%20(3)/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
		
		
	}

}
