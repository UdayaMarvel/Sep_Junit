package com.amazon;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.common.amazon.CommonActions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
@Before
public void browserInitialiser(Scenario scenario) {
	CommonActions.browserLaunch();
	final byte[] beforeSS = ((TakesScreenshot)CommonActions.driver).getScreenshotAs(OutputType.BYTES);
	scenario.embed(beforeSS, "image/png");
}

@After
public void browserExiter(Scenario scen) {
	CommonActions.browserClose();
	final byte[] beforeSS = ((TakesScreenshot)CommonActions.driver).getScreenshotAs(OutputType.BYTES);
	scen.embed(beforeSS, "image/png");
}
	
}
