package com.stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Step1:user is on login page");
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	}

	@When("^user enters (.*) and (.*)$")

	public void user_enters_email_address_and_passward(String email,String pswd) {
		System.out.println("Step2:user enters email address and passward");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pswd);
	    
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Step3:click on login button");
		driver.findElement(By.name("login")).click();
	   
	}

	@Then("user should lands on homepage")
	public void user_should_lands_on_homepage() {
		System.out.println("Step4:user should lands on homepage");
		driver.close();
	}
		
		@When("user enters credentails using DataTable")
		public void user_enters_credentails_using_DataTable(DataTable dataTable)
		{
			System.out.println("Step2:user enters email address and passward");
			List<List<String>> data=dataTable.cells();
			driver.findElement(By.id("email")).sendKeys(data.get(0).get(0));
			driver.findElement(By.id("pass")).sendKeys(data.get(0).get(1));  
		

	

	}


}
