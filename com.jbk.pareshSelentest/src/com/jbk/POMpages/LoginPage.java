package com.jbk.POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//POM class==> WebElement &Methods
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement LoginBtn;
	
	//Constructor with driver as a nparameter
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	
	//Method
	public void loginToApplication(String name, String pass) {
		
			username.sendKeys(name);
			password.sendKeys(pass);
			LoginBtn.click();
	}
	
}
