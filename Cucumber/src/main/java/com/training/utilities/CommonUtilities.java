package com.training.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import static com.training.utilities.Constants.APPLICATION_PROPERTIES;
import static com.training.utilities.Constants.USER_DIR;


public class CommonUtilities {
	public String getApplicationProperty(String key) throws FileNotFoundException {
		Properties prop = new Properties();
		String filePath = USER_DIR+File.separator+APPLICATION_PROPERTIES;	
		FileInputStream inputFile = new FileInputStream(filePath);
		String value = "";
		try {
			prop.load(inputFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				inputFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		value = prop.getProperty(key);
		return value;
		
	}

}
