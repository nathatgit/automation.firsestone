package com.qa.stepDefinitions;

import com.qa.utils.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksFirestone extends TestBase{
	
	@Before
	public void setUp() {

		Initialization();

		
	} 

	
	@After void TearDown ()
	{
		DeInitialization();
	}
}
