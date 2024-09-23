package com.locators.amazon;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.common.amazon.CommonActions;

public class SearchLocators {

	public SearchLocators() {
		PageFactory.initElements(CommonActions.driver,this);
	}
	
	public WebElement getSearch() {
		return search;
	}

	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement search;
	
	@FindBy(xpath = "xpath Value")
	private List<WebElement> l ;
}
