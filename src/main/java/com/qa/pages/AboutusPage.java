package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class AboutusPage extends TestBase {

	// PageFactoy List

	List<String> getList = new ArrayList();

	@FindBy(xpath = "//a[@clickvalue='Company Overview']")
	WebElement About_link;

	@FindBy(css = "div#anchor_tab_0>div>section.text-description-container.component-wrapper>h2")
	WebElement AbtUstext;

	@FindAll({ @FindBy(xpath = "//ul[@role='tablist']/li/a") })
	List<WebElement> tabs;

	@FindAll({ @FindBy(css = "h2.heading") })
	List<WebElement> heading;

	@FindBy(xpath = "//a[@clickvalue='Roofing']")
	WebElement Roofing_Link;

	public AboutusPage() {

		PageFactory.initElements(driver, this);

	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getPagetext() {
		return AbtUstext.getText();
	}

	public List<String> getTabs() {
		System.out.println(driver);

		for (int i = 0; i < tabs.size(); i++) {

			System.out.println(tabs.get(i).getText());
			getList.add(tabs.get(i).getText());

		}

		return getList;

	}

	public List<String> Heading() {

		for (int i = 0; i < heading.size(); i++) {

			getList.add(i, heading.get(i).getText());

		}

		return getList;

	}

	public Roofing_Page getroofingPage() {

		Roofing_Link.click();

		return new Roofing_Page();
	}

}
