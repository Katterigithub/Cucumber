package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage{
	static WebDriver driver;
	
	public LoginPage() {
		super(driver = BaseTest.getDriver());
		
		addObject("username", By.xpath("//input[@id='email_field']"));
		addObject("password", By.xpath("//input[@id='password_field']"));
		addObject("login", By.xpath("//button[contains(text(),'Login')]"));
		
	}
	
}
