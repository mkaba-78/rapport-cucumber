package com.canal.rapport;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources",
glue = "com.canal.rapport",
format = {"json:target/cucumber.json"}
		)
public class CucumberTest {
}
