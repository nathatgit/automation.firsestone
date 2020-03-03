package com.qa.stepDefinitions;

import com.qa.pages.AboutusPage;
import com.qa.pages.Home_Page;
import com.qa.pages.Roofing_Page;
import com.qa.utils.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AboutUsSteps extends TestBase {
	AboutusPage abp = new AboutusPage();
	Home_Page hp = new Home_Page();

	@Given("^user is on About Us Page$")
	public void user_is_on_About_Us_Page() {

		hp.getAbtPage();

		Assert.assertEquals(abp.getPagetext(), prop.getProperty("aboutuspagetext"));

		System.out.println(abp.getTitle());

	}

	@When("^user verify tabs links on the page$")
	public void user_verify_tabs_links_on_the_page() {

		System.out.println(abp.getTabs());
	}

	@Then("^user verify headings present on the page$")
	public void user_verify_headings_present_on_the_page() {

		System.out.println(abp.Heading());

	}

	}
