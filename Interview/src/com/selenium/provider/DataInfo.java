package com.selenium.provider;

import org.testng.annotations.DataProvider;

public class DataInfo {

	
	@DataProvider(name = "googleInfo")
	public Object[][] data(){
		return new Object[][] {
			{"Wizeline"},
			{"Facebook"}
		};
		
	}
}
