package com.amazon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Command;

import com.common.amazon.CommonActions;
import com.locators.amazon.SearchLocators;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Todays_Deals extends CommonActions {
	CommonActions co = new CommonActions();
	SearchLocators se = new SearchLocators();

	@Given("Goto Amazon {string}")
	public void goto_amazon(String url) throws IOException {
		File f = new File(".\\src\\test\\resources\\Credentials.property");
		FileInputStream f1 = new FileInputStream(f);
		Properties p = new Properties();
		p.load(f1);
		String user = p.getProperty("username");
		System.out.println(user);
		String newUrl = p.getProperty("url");
		
		p.setProperty("user", "marvel");
		
		FileOutputStream f2 = new FileOutputStream(f);
		p.save(f2, "updated in property file");//depreciation
		
		co.driver.get(newUrl);
	}

	
	@When("Click on search field")
	public void click_on_search_field() throws IOException {
	 co.button(se.getSearch());
	   co.ss((new File("C:\\Users\\ADMIN\\eclipse-workspace\\SepProjectDirect\\target\\ts1.png")));
	}

	
	
	@When("search for any product with one dim map")
	public void search_for_any_product_with_one_dim_map(DataTable dataTable)
	{
		Map<String, String> products = dataTable.asMap(String.class, String.class);
		String product = products.get("phone2");
		co.typeText(se.getSearch(), product);
	}
	@When("search for any product {string}")
	public void search_for_any_product(String product) throws IOException {
		co.typeText(se.getSearch(), product); 
		co.ss(new File("C:\\Users\\ADMIN\\eclipse-workspace\\SepProjectDirect\\target\\ts2.jpeg"));
	}

	@Then("List the Products displayed in the below grid")
	public void list_the_products_displayed_in_the_below_grid() {
	    
	}
	@When("Click on any product")
	public void click_on_any_product() {
	  
	}

	@Then("Validate the same product clicked")
	public void validate_the_same_product_clicked() {
	   
	}
	@Then("Validate")
	public void validate() {
	    
	    throw new cucumber.api.PendingException();
	}
}
