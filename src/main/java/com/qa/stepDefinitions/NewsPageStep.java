package com.qa.stepDefinitions;

import com.qa.pages.News_Page;
import com.qa.utils.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class NewsPageStep extends TestBase{
	
	
	
	News_Page np = new News_Page();
	
	
	@Given("^user is on News Page$")
	public void user_is_on_News_Page() {
		
		np.getNewsPage();
		
		Assert.assertEquals(np.getPagetitle(), prop.getProperty("newspagetitle"));
		
	}

	@When("^user verify page heading$")
	public void user_verify_page_heading() {
	}

	@When("^user verify all headings on the page$")
	public void user_verify_all_headings_on_the_page(){
	}

	@Then("^user verify pagination$")
	public void user_verify_pagination() {
	}

	
	
	
}
