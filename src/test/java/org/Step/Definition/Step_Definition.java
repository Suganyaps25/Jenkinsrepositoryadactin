package org.Step.Definition;

import org.Test.Runner.Test_runner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition {
static WebDriver driver = Test_runner.driver;

	@Given("user Launch The Adactin App")
	public void user_launch_the_adactin_app() {
       driver.get("https://adactinhotelapp.com/");	    
	}
	@When("user Enters The Username In The Username Button")
	public void user_enters_the_username_in_the_username_button() {
		driver.findElement(By.id("username")).sendKeys("Admin1122");
		
	}   
	@When("user Enters The Password In The Password Button")
	public void user_enters_the_password_in_the_password_button() {
	   driver.findElement(By.id("password")).sendKeys("Bgopi@2109");	
		
	}
	@Then("user Clicks The Login Button And It Navigates To Search For Hotels Page")
	public void user_clicks_the_login_button_and_it_navigates_to_search_for_hotels_page() 
	{
	  driver.findElement(By.id("login")).click();  
	}
	
	
	
}
