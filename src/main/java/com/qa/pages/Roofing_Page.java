package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class Roofing_Page extends TestBase{

	
	List <String> getList = new ArrayList();
	
	@FindBy(xpath="//div[@class='d-flex justify-content-center bg-white dropdown-link-button']/button")
	WebElement all_systems;
	
	@FindAll ({@FindBy(css="div#allSystems>ul>li>a")})
	List <WebElement> tabs_links;
	
	@FindAll ({@FindBy(css="div.margin-textimage>h2")})
	List <WebElement> header_texts;
	
	
	public Roofing_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getPagetitle()
	{
		return driver.getTitle();
	}
	
	public String verifyAllSystem()
	{
		
		
		return all_systems.getText();
				
	}
	
	public List <String> getTablinks() 
	{
		
		for(int i =0 ; i<= tabs_links.size();i++)
		{	
			getList.add(tabs_links.get(i).getText());
		}
		
		return getList;
		
	}
	
	public List <String> getHeaderstext() 
	{
		
		for(int i =0 ; i<= header_texts.size();i++)
		{	
			getList.add(header_texts.get(i).getText());
		}
		
		return getList;
		
	}
		
	
	
	
	
}
