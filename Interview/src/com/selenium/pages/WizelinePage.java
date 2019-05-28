package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WizelinePage extends BasePage{

	public WizelinePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h3[contains(text(),'Wizeline | Engineering a Better Tomorrow')]")
	WebElement WizelineLink;
	
	public boolean textDisplayed() {
		try {
			isDisplayed(WizelineLink);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	
}
