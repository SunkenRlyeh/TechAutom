package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
	features="CucumberFeature",
	glue="com.stepsdefinition",
	tags="@newaccount"
	
	)


public class TestNGRunner extends AbstractTestNGCucumberTests{
}
