package com.selenium.test;

import org.testng.annotations.Test;

import com.selenium.pages.GoogleHomePage;
import com.selenium.provider.DataInfo;

public class GoogleHappyPathTest extends BaseTest{

	@Test(dataProvider = "googleInfo", dataProviderClass = DataInfo.class)
	public void googleSearch(String text) {
		
		GoogleHomePage home = new GoogleHomePage(driver);
		home.type(text);
		home.clickSearchButton();
		
		System.out.println("Search successful");
	}
}
