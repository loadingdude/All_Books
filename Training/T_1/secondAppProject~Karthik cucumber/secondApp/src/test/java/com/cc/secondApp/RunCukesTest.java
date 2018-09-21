package com.cc.secondApp;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Karthik on 7/1/2017.
 */


@RunWith(Cucumber.class)
@CucumberOptions(
        format = {
                "json:target/cucumber/demo.json",
                "html:target/cucumber/demo.html",
                "pretty"
        },
        features = "src/test/resources",
        monochrome = true,
        snippets = SnippetType.UNDERSCORE
)

public class RunCukesTest {

}
