package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(
	features={"src/test/java/features"},glue = {"Steps"},dryRun = false, 
snippets= SnippetType.CAMELCASE	
		)

public class Runner extends AbstractTestNGCucumberTests
{

	
}
