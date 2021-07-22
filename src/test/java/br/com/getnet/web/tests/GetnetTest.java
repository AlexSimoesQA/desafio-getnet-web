package br.com.getnet.web.tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
	publish = true,
	plugin = {"pretty"},
	monochrome = true,
	glue = "br.com.getnet.web.steps",
	features = "src/test/resources/features",
	snippets = SnippetType.CAMELCASE,
	dryRun = false
)
public class GetnetTest {

}
