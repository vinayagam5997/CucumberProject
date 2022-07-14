package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles" ,glue= {"stepDefinitions","TaggedHooks"},monochrome=true,
tags= {"@background,@Taggedhooks"})
public class runnerclass {
//it should combine feature file and step definition
}
