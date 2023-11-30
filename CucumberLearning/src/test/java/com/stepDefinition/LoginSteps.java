package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

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

	@When("user enters email address and passward")
	public void user_enters_email_address_and_passward() {
		System.out.println("Step2:user enters email address and passward");
		driver.findElement(By.id("email")).sendKeys("deepikapoluuri@gmaul.com");
		driver.findElement(By.id("pass")).sendKeys("Varadhi@2022");
	    
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


}
