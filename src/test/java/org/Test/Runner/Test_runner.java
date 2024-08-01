package org.Test.Runner;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/org/Adactin/feature/Adactin.feature"
,glue = "org.Step.Definition",
monochrome = true,
dryRun = false,
stepNotifications = true,
tags="@first",
publish = true)


		
public class Test_runner {
	
public static WebDriver driver;
		@BeforeClass
public static void launch() {
			
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		
		}

		
//@AfterClass
//public static void close() {
//	driver.close();
//}		

}
