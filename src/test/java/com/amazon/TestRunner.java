package com.amazon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\Amazon.feature",
				 glue="com.amazon",
				 tags={"@AllDeals","@out"},
				 plugin = {"html:target","json:target/reports.json"},
				 monochrome = true,
				 dryRun = false)
public class TestRunner {
	
	

}
