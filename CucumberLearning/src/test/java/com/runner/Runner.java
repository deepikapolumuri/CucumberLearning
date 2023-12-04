package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features",glue={"com.stepDefinition"},
monochrome=true,
plugin= {"html:Reports/cucumber-reports/reports.html","json:Reports\\JsonReports\\Cucumber.json",
		"junit:Reports\\JUnitReports\\Cucumber.xml"},
dryRun=false,

tags="@FunctionalTest and @SmokeTest"


	)


public class Runner {

}
