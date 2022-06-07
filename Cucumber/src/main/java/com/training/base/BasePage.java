package com.training.base;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	WebDriver driver;
	public HashMap<String, By> ObjRep = new HashMap<String, By>();
	public BasePage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	public void addObject(String logicalName,By by) {
		ObjRep.put(logicalName, by);
	}
	
	public void enterIntoTextBox(String logicalName, String value) {
		WebElement element = getWebElement(logicalName);
		enterIntoTextBox(element,value);
			
	
	}
	
	public void clickRadioButton(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickRadioButton(element);
	}
	public void validateText(String logicalName, String expectedValue) {
		WebElement element = getWebElement(logicalName);
		validateText(element,expectedValue);
	}
	

	
		
	
	
	public void clickButton(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickButton(element);
	}
	
/*****************************************Private methods***********************************/
	private void enterIntoTextBox(WebElement element,String value) {
		waitForElement(element);
		element.sendKeys(value);
	}
	private void clickButton(WebElement element) {
		waitForElement(element);
		element.click();
		
	}
	private void clickRadioButton(WebElement element) {
		waitForElement(element);
		element.click();
		
	}
	
	private void validateText(WebElement element, String expectedValue) {
		waitForElement(element);
		String actualValue = element.getText();
	Assert.assertEquals(actualValue, expectedValue);
	}
	private WebElement getWebElement(String logicalName) {
		WebElement element = null;
		By by = null;
		by = ObjRep.get(logicalName);
		element = driver.findElement(by);
		return element;
	}
	
	private void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
