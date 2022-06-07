package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class HomePage extends BasePage{
	static WebDriver driver;
	public HomePage() {
		super(driver= BaseTest.getDriver());
		addObject("name", By.xpath("//input[@id='name']"));
		addObject("fatherName", By.xpath("//input[@id='lname']"));
		addObject("female",By.cssSelector("#radiobut[value='female']"));
		addObject("pageHeader", By.xpath("//h1[normalize-space()='Student Registration Form']"));
	}


}
