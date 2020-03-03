Feature: Validate Roofing Page elements 

	@roofing @regression
	Scenario: Validate Roofing Page Elements
	Given user is on Roofing Page
	When user verify all system menu and its child page text on the page
	Then user verify headings on the page
	
	