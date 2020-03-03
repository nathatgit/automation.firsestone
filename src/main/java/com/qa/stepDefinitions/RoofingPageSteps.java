package com.qa.stepDefinitions;

import com.qa.pages.AboutusPage;
import com.qa.pages.Roofing_Page;
import com.qa.utils.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class RoofingPageSteps extends TestBase {

	AboutusPage abp = new AboutusPage();

	Roofing_Page rp = new Roofing_Page();

	@Given("^user is on Roofing Page$")
	public void user_is_on_Roofing_Page() {

		abp.getroofingPage();

		Assert.assertEquals(rp.getPagetitle(), prop.getProperty("roofingpagetitie"));

	}

	@When("^user verify all system menu and its child page text on the page$")
	public void user_verify_all_system_menu_and_its_child_page_text_on_the_page() {

		Assert.assertEquals(rp.verifyAllSystem(), prop.getProperty("roofingpagetitie"));
		
		String[] expected = { "EPDM ROOFING SYSTEM", "TPO ROOFING SYSTEM", "ASPHALT ROOFING SYSTEM",
				"METAL ROOFING SYSTEM", "INSULATION", "ROOF ENHANCEMENTS", "FIRESTONE PVC" };

		if (expected.length != rp.getTablinks().size()) {
			System.out.println("Fail, Wrong numbers of elements found");
		} else {

			for (int i = 0; i < expected.length; i++) {
				String value = rp.getTablinks().get(i);
				if (value.equals(expected[i])) {
					System.out.println("Passed for" + value);
				} else {

					System.out.println("Failed on" + value);

				}

			}

		}

	}

	@Then("^user verify headings on the page$")
	public void user_verify_headings_on_the_page() {
		
		
		String[] expected = { "EPDM ROOFING SYSTEM", "TPO ROOFING SYSTEM", "ASPHALT ROOFING SYSTEM",
				"METAL ROOFING SYSTEM", "INSULATION", "FIRESTONE PVC" };

		if (expected.length != rp.getHeaderstext().size()) {
			System.out.println("Fail, Wrong numbers of elements found");
		} else {

			for (int i = 0; i < expected.length; i++) {
				String value = rp.getHeaderstext().get(i);
				if (value.equals(expected[i])) {
					System.out.println("Passed for" + value);
				} else {

					System.out.println("Failed on" + value);

				}

			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(rp.getHeaderstext());
	}

}
