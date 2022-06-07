package com.training.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected static WebDriver driver;
	static CommonUtilities common = new CommonUtilities();
	
	public synchronized static WebDriver getDriver() {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		
		return driver;
	}
	public static void launchApplication() throws FileNotFoundException {
		String url = common.getApplicationProperty("url");
		driver = getDriver();
		driver.get(url);
	}
	

	public static void takeScreenShot(WebDriver driver) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		Date currentDate = new Date();
		String timeStamp = new SimpleDateFormat("YYYY-MM-DD HH-MM-SS").format(currentDate);
		String reportFileName = "Screenshots" +timeStamp+ ".html";
		System.out.println(reportFileName);
		String fileSeparator = System.getProperty("file.separator");
		System.out.println(fileSeparator);
		String reportFilePath = "C:\\Users\\abhis\\eclipse-workspace\\TestngProject"+fileSeparator+"Screenshots";
		System.out.println(reportFilePath);
		String filePath = reportFilePath+fileSeparator+reportFileName;
		System.out.println(filePath);
		File destFile = new File(filePath);
		FileUtils.copyFile(srcFile, destFile);
		
	}
}
