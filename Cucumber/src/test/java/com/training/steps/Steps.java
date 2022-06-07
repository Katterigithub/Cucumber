package com.training.steps;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pageFactory.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps extends BaseTest{
	BasePage page;
	PageFactory pageFactory = new PageFactory();

	@Before
	public void setUp() throws FileNotFoundException {
		launchApplication();

	}

	@Given("User on {string}")
	public void user_on(String pageName) throws InterruptedException {
		System.out.println(pageName);
		page = pageFactory.initialize(pageName);
		Thread.sleep(1000);
		//System.out.println(page);

	}

	@When("User enter value into textbox {string} {string}")
	public void user_enter_value_into_textbox(String logicalName, String value) {
		page.enterIntoTextBox(logicalName, value);
	}


	@Then("click on {string} button")
	public void click_on_button(String logicalName) {
		page.clickButton(logicalName);
	}

	@When("User click on RadioButton {string}")
	public void user_click_on_radio_button(String logicalName) {
	   page.clickRadioButton(logicalName);
	}
	@When("User validates the text {string} {string}")
	public void user_validates_the_text(String logicalName, String expectedValue) {
	   page.validateText(logicalName,expectedValue);
	}


}
