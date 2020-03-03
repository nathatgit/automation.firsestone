package com.qa.stepDefinitions;

import com.qa.pages.AboutusPage;
import com.qa.pages.Home_Page;
import com.qa.utils.TestBase;

import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends TestBase {

	Home_Page hp = new Home_Page();

	@Given("^user is on homePage Url$")
	public void user_is_on_homePage_Url() {

		Assert.assertEquals(hp.getPagetitle(), prop.getProperty("homepagetitle"));

		hp.getPagetitle();

	}

	@When("^user validate header elements$")
	public void user_validate_header_elements() {

		Assert.assertTrue(hp.getPageLogo(), "Page Logo is not visible");
		Assert.assertTrue(hp.verifyfooter(), "Footer is not visible");
		Assert.assertTrue(hp.verifyLangSel(), "Language Selector is not visible");
		Assert.assertTrue(hp.verifyMenuBtn(), "Header Menu option is not visible");
		Assert.assertTrue(hp.verifySearchBar(), "Header Search Bar is not  visible");
		Assert.assertTrue(hp.verifySearchBtn(), "Header Search button is not visible");
		Assert.assertTrue(hp.verifySerachCat(), "Header Search Category is not visible");

	}

	@Then("^user validate page elements$")
	public void user_validate_page_elements() {

		Assert.assertEquals(hp.verifyHomePageContent(), prop.getProperty("homepagetext"));

	}

	@When("^user validate to footer links$")
	public void user_validate_to_footer_links() {

		if (hp.verifyfooter()) {
			hp.verifyFooterlinks();
		} else {
			System.out.println("Footer links are not appearing.");
		}

	}

}
