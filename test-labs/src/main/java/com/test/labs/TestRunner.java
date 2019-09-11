package com.test.labs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberFeatureWrapper;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleEventWrapper;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions(features = "src/test/resources/feature", 
					glue = { "com.test" }, 
					tags = { "@mytest" })
public class TestRunner {
	private TestNGCucumberRunner testRunner;

	@BeforeClass
	public void setup(){
		testRunner = new TestNGCucumberRunner(this.getClass());
	}
		
	@Test(groups = "Cucumber", description = "Runs Cucumber Feature", dataProvider = "scenarios")
	public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {
		testRunner.runScenario(pickleEvent.getPickleEvent());
	}

	@DataProvider
	public Object[][] scenarios() {
		return testRunner.provideScenarios();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		testRunner.finish();
	}

}
