package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.utils.TestBase;

public class Home_Page extends TestBase {

	@FindBy(css = "a.navbar-brand")
	WebElement Home_logo;

	@FindBy(css = "form.form-for-input")
	WebElement Search_bar;

	@FindBy(css = "div.search-bar-filter.dropdown-all")
	WebElement Search_categories;

	@FindBy(css = "button.find-button")
	WebElement Search_btn;

	@FindBy(css = "span.globe-icon.margin-auto.d-block")
	WebElement Lang_selector;

	@FindBy(css = "span.person-icon.margin-auto.d-block")
	WebElement Login_link;

	@FindBy(css = "span.menu-icon.margin-auto.d-block.border-0")
	WebElement Menu_icon;

	@FindBy(css = "div.tab-container.component-wrapper>h1")
	WebElement Home_categories;

	@FindBy(xpath = "//a[@href='#tab_0']")
	WebElement Home_cat1;

	@FindBy(xpath = "//a[@href='#tab_1']")
	WebElement Home_cat2;

	@FindBy(xpath = "//a[@href='#tab_2']")
	WebElement Home_cat3;

	@FindBy(css = "footer.footer-container")
	WebElement Footer;

	@FindBy(xpath = "//a[@clickvalue='Company Overview']")
	WebElement About_link;

	@FindAll({ @FindBy(css = "ul.show-f>li>a") })
	List<WebElement> Footerlinks;

	// Initializing the page WebElements objects

	public Home_Page() {
		

		PageFactory.initElements(driver, this);
	}

	public String getPagetitle() {

		System.out.println(driver.getTitle());
		return driver.getTitle();

	}

	
	  public boolean getPageLogo() {
		  
	  System.out.println("=================="); 
	 return Home_logo.isDisplayed(); 
	  }
	 
	public boolean verifyfooter() {
		return Footer.isDisplayed();
	}

	public boolean verifySearchBar() {
		return Search_bar.isDisplayed();
	}

	public boolean verifySerachCat() {
		return Search_categories.isDisplayed();
	}

	public boolean verifySearchBtn() {
		return Search_btn.isDisplayed();
	}

	public boolean verifyLangSel() {
		return Lang_selector.isDisplayed();
	}

	public boolean verifyMenuBtn() {
		return Menu_icon.isDisplayed();
	}

	public String verifyHomePageContent() {

		String homeCatHeader = Home_categories.getText();

		return homeCatHeader;
	}

	public void verifyFooterlinks() {
		/*
		 * ArrayList <String> URLS = new ArrayList <String>(); for(int i = 0 ; i<=
		 * Footerlinks.size();i++) { URLS.add(Footerlinks.get(i).getAttribute("href"));
		 * }
		 */
		for (int i = 0; i < Footerlinks.size(); i++) {
			System.out.println(Footerlinks.get(i).getAttribute("href"));
		}

	}
	
	public void getAbtPage() 
	{
		About_link.click();
	}
	
	
	/*
	 * public AboutusPage getaboutusPage() {
	 * 
	 * 
	 * return new AboutusPage(); }
	 */

	
}
