package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage extends BasePage{

	public GoogleHomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")
	WebElement searchBox;
	@FindBy(xpath= "//div[@class='FPdoLc VlcLAe']/center/input[1]")
	WebElement searchButton;
	
	public void type(String text) {
		typeText(searchBox, text);
	}
	public void clickSearchButton() {
		click(searchButton);
	}
	
	

}
