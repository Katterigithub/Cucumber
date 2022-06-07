package com.training.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(plugin = {"pretty",
            "html:target/cucumber-reports/cucumber.html",
            "json:target/cucumber-reports/cucumber.json"
    },
			features="C:\\Users\\abhis\\eclipse-workspace\\Cucumber\\resources\\features\\tekarchAppGeneric.feature"
			,glue= {"com.training.steps"}
			//,tags= "@Smoke"
			)
			
	public class Runner {

	}
	
	
    
	
	
	
	
	
