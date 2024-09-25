package com.common.amazon;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	public static WebDriver driver;
	public static Actions a;
 //launching the driver
	public static void browserLaunch() {
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    a = new Actions(driver);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void browserClose() {
	}
	public void typeText(WebElement refName, String value) {
		refName.sendKeys(value);
	}
	public void button(WebElement refName) {
		refName.click();
	}
	public void typeText(String value,WebElement refName) {
		a.sendKeys(refName, value).build().perform();
	}
	public void button() {
		a.click().build().perform();
	}
	public void rightClick(WebElement e) {
		a.contextClick(e).build().perform();
	}
	
	public void switchWindow() {
		String parent = driver.getWindowHandle();
		Set<String> childUrl = driver.getWindowHandles();
		for (String c : childUrl) {
			if(!parent.equals(childUrl)) {
				driver.switchTo().window(c);
			}
		}
	}
	public void ss(File dest) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, dest);
		
	}
	
}
