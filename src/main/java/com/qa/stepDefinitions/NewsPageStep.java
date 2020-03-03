package com.qa.stepDefinitions;

import com.qa.pages.News_Page;
import com.qa.utils.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

public class NewsPageStep extends TestBase {

	News_Page np = new News_Page();

	@Given("^user is on News Page$")
	public void user_is_on_News_Page() {

		np.getNewsPage();

		Assert.assertEquals(np.getPagetitle(), prop.getProperty("newspagetitle"));

	}

	@When("^user verify page heading$")
	public void user_verify_page_heading() {

		Assert.assertEquals(np.getPageHeading(), prop.getProperty("newspageheading"));
	}

	@When("^user verify all headings on the page$")
	public void user_verify_all_headings_on_the_page() {

		Assert.assertTrue(np.getHeading1(), "1st heading is not present");
		Assert.assertTrue(np.getHeading2(), "2nd heading is not present");
		Assert.assertTrue(np.getHeading3(), "3rd heading is not present");

	}

	@Then("^user verify pagination$")
	public void user_verify_pagination() {

		Assert.assertTrue(np.isPaginationExists(), "pagination does not exist");
		Assert.assertTrue(np.isPreviousPagination(), "previous link does not exist");
		Assert.assertTrue(np.isNextPagination(), "next link does not exist");

	}

}
