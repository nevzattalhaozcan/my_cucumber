package com.my_project.cukes_runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/test_report.html",
                  "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/my_project/step_definitions",
        dryRun = false,
        tags = "@Standart"
)
public class CukesRunner {
}
