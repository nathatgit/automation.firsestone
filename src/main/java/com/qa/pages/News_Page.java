package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class News_Page extends TestBase {
	
	@FindBy(css="h1.m-title")
	WebElement pageHeading;
	
	@FindBy(id="heading_1")
	WebElement heading1;
	
	@FindBy(id="heading_2")
	WebElement heading2;
	
	@FindBy(id="heading_3")
	WebElement heading3;

	@FindBy(css="ul#pagination")
	WebElement pagination;
	
	@FindBy(css="a.page-link.prev-p")
	WebElement previoiuslink;
	
	@FindBy(css="page-link next-p")
	WebElement nextlink;
	
	@FindBy(css="a.page-link.active")
	WebElement activePage;
	
	@FindBy(xpath="//a[contains(text(),'News')]")
	WebElement NewsPageLink;
	
	public News_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getPagetitle()
	{
		
		return driver.getTitle();
	}
	
	
	public String getPageHeading()
	{
		
		return pageHeading.getText();
	}
	
	
	public boolean getHeading1()
	{
		
		return heading1.isDisplayed();
	}
	public boolean getHeading2()
	{
		
		return heading2.isDisplayed();
	}
	public boolean getHeading3()
	{
		
		return heading3.isDisplayed();
	}
	
	
	public boolean isPaginationExists ()
	{
				
		return pagination.isDisplayed();
	}
	
	public boolean isNextPagination()
	{
		return nextlink.isDisplayed();
		
	}
	
	
	public boolean isPreviousPagination()
	{
		
		activePage.click();
		return previoiuslink.isDisplayed();
		
	}
	
	public String getPaginationPosition()
	{
		String str = null;
		
		str = activePage.getAttribute("aria-lable");
		
		return str;
		
	}
	
	public void getNewsPage()
	{
		
		NewsPageLink.click();
		
	}
	
	
	
}


